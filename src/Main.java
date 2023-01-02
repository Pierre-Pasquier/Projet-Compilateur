import parser.exprLexer;
import parser.exprParser;
import parser.exprParser.ProgramContext;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import ast.*;
import graphViz.GraphVizVisitor;

public class Main {

    public static void main(String[] args){

        

        if (args.length < 1){
            System.out.println("Error : Expected 1 argument filepath, found 0");
            return;
        }

        String testFile = args[0];

        try {

            //chargement du fichier et construction du parser

            CharStream input = CharStreams.fromFileName(testFile);
            exprLexer lexer = new exprLexer(input); 
            CommonTokenStream stream = new CommonTokenStream(lexer);
            exprParser parser = new exprParser(stream);

            // Récupération du noeud program (le noeud à la racine)
            ProgramContext program = parser.program();

            // Visiteur de création de l'AST + création de l'AST
            AstCreator creator = new AstCreator();
            Ast ast = program.accept(creator);

            // Visiteur de représentation graphique + appel
            GraphVizVisitor graphViz = new GraphVizVisitor();
            ast.accept(graphViz);
            graphViz.dumpGraph("./out/tree.dot");

            //Affichage de la TDS
            print_tds(creator.tds);

        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (RecognitionException e) {
            e.printStackTrace();
        }
        
    }


    public static int depl(String x, List<List> tds, int num_region){
        if (x.equals("int")){
            return 4;
        }
        else if (x.equals("String")){
            return 1;
        }
        else{
            if (is_in_tds(x,tds,num_region) != null){
                if (getAttribut(x,tds,num_region).equals("TYPEARRAY")){
                    String type = getTypeElemOfArray(x, tds, num_region);
                    return depl(type,tds,num_region);
                }
            }
        }
        return 0;
    }

    public static Result is_in_tds(String x, List<List> list_tds, int num_region){
        int i = getTds(num_region, list_tds);   //Récupère le numéro de la tds avec le num de la région
        List<List> tds = list_tds.get(i);
        for (int j = 0; j < tds.size(); j++){   //Pour chaque ligne de la tds
            List<String> tds_region = tds.get(j);
            for (int k = 0; k < tds_region.size(); k++){    //Pour chaque élément de la TDS
                String tds_region_var = tds_region.get(k);
                if (tds_region_var.equals(x)){
                    return new Result(i,j,k);
                }
            }
        }
        return null;
        
    }

    public static int getTds(int num_region, List<List> list_tds){
        for (int i = 0; i < list_tds.size(); i++){
            List<List> tds = list_tds.get(i);
            List<String> tds_region = tds.get(0);
            String nom = tds_region.get(0);
            if (nom.matches("TDS_.*_"+num_region+"_.*")){
                return i;
            }
        }
        return -1;
    }

    final static class Result {
        private final int first;
        private final int second;
        private final int third;
    
        public Result(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    
        public int getNumTds() {
            return first;
        }
    
        public int getLigne() {
            return second;
        }

        public int getColonne() {
            return third;
        }
    }

    final static class Args {
        private final int nombre;
        private final List<String> types;
    
        public Args(int nombre, List<String> types) {
            this.nombre = nombre;
            this.types = types;
        }
    
        public int getNombre() {
            return nombre;
        }

        public List<String> getTypes() {
            return types;
        }
    }
    
    public static String getAttribut(String x, List<List> tds_list, int num_region){
        int i = getTds(num_region, tds_list);       //Récupère le numéro de la tds avec le num de la région
        List<List> tds = tds_list.get(i);       //Récupère la tds
        Result res = is_in_tds(x,tds_list,num_region);  
        if (res != null){
            List<String> tds_region = tds.get(res.getLigne());  //Récupère la ligne de la tds
            return tds_region.get(1);
        }
        else{
            return null;
        }
    }

    public static void print_tds(List<List> tds_list){
        List<List> liste_ordonnee = new ArrayList<List>();
        for (int i=0; i < tds_list.size(); i++){
            liste_ordonnee.add(null);
        }
        for (int i = 0; i < tds_list.size(); i++){
            List<List> tds = tds_list.get(i);
            //System.out.println("\n" + tds.get(0).get(0) + " :");
            List<String> tds_region = tds.get(0);
            String nom = tds_region.get(0);
            String[] nom_split = nom.split("_");
            String num_region = nom_split[2];
            liste_ordonnee.remove(Integer.parseInt(num_region)-1);
            liste_ordonnee.add(Integer.parseInt(num_region)-1, tds);
            //System.out.println(tds_region);
        }
        for (int i = 0; i < liste_ordonnee.size(); i++){
            List<List> tds = liste_ordonnee.get(i);
            System.out.println("\n" + tds.get(0).get(0) + " :");
            for (int j = 1; j < tds.size(); j++){
                List<String> tds_region = tds.get(j);
                System.out.println(tds_region);
            }
        }

    }

    public static String getType(String x, List<List> tds_list, int num_region){ //Retourne le type d'un élément dont l'attribut est VAR
        if (getAttribut(x, tds_list, num_region).equals("VAR")){
            int i = getTds(num_region, tds_list);       //Récupère le numéro de la tds avec le num de la région
            List<List> tds = tds_list.get(i);       //Récupère la tds
            Result res = is_in_tds(x,tds_list,num_region);  
            if (res != null){
                List<String> tds_region = tds.get(res.getLigne());  //Récupère la ligne de la tds
                return tds_region.get(2);
            }
            else{
                return null;
            }
        } else {
            return null;
        }
    }

    public static Args getTypeArgs(String x, List<List> tds_list, int num_region){
        if (getAttribut(x, tds_list, num_region).equals("METHOD")){
            int i = getTds(num_region, tds_list);       //Récupère le numéro de la tds avec le num de la région
            List<List> tds = tds_list.get(i);       //Récupère la tds
            Result res = is_in_tds(x,tds_list,num_region);  
            if (res != null){
                List<String> tds_region = tds.get(res.getLigne());  //Récupère la ligne de la tds
                int nombre = Integer.parseInt(tds_region.get(3));
                List<String> types = new ArrayList<String>();
                for (int j = 4; j < tds_region.size(); j++){
                    types.add(tds_region.get(j));
                }
                return new Args(nombre, types);
            }
            else{
                return null;
            }
        } else {
            return null;
        }
    }


    public static String getTypeElemOfArray(String x, List<List> tds_list, int num_region){
        if (getAttribut(x, tds_list, num_region).equals("TYPEARRAY")){
            int i = getTds(num_region, tds_list);       //Récupère le numéro de la tds avec le num de la région
            List<List> tds = tds_list.get(i);       //Récupère la tds
            Result res = is_in_tds(x,tds_list,num_region);  
            if (res != null){
                List<String> tds_region = tds.get(res.getLigne());  //Récupère la ligne de la tds
                return tds_region.get(3);
            }
            else{
                return null;
            }
        } else {
            return null;
        }
    }


}