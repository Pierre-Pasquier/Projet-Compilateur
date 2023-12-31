package ast;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


public class TDS {
    public static int num_region = 1;
    public static List<Integer> pile_region = new ArrayList<Integer>();
    public static int num_imbrication = 0;
	public static PrintWriter writer;
    public static String fonction_etudiee = null;
    public static List<String> list_var = new ArrayList<String>();
    public static List<List> tds;
    public static boolean write_instanciee = false;

    public TDS(int num_region, int num_imbrication) throws FileNotFoundException, UnsupportedEncodingException{
        this.num_region = num_region;
        this.num_imbrication = num_imbrication;
    }

    //Renvoie le déplacement de l'élément passé en paramètre 
    public static int depl(String x, List<List> tds, int num_region){
        if(num_region == -1){
            if (x.equals("int")){
                return 4;
            }
            else if (x.equals("String")){
                return 1;
            }
        }
        String type = getType(x, tds);
        if (type.equals("int")){
            return 4;
        }
        else if (type.equals("String")){
            return 1;
        }
        else{
            if (is_in_tds(x,tds,num_region) != null){
                if (getAttribut(x,tds,num_region).equals("TYPEARRAY")){
                    String type2 = getTypeElemOfArray(x, tds, -1);
                    return depl(type2,tds,num_region);
                }
            }
        }
        return 0;
    }


    //Renvoie l'indice dans la tds, sa ligne et sa colonne de l'élément passé en paramètre
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

    //Renvoie numéro de la Tds avec le numéro de région passé en paramètre
    public static int getTds(int num_region, List<List> list_tds){
        for (int i = 0; i < list_tds.size(); i++){
            List<List> tds = list_tds.get(i);
            List<String> tds_region = tds.get(0);
            String nom = tds_region.get(0);
            if (nom.matches("TDS_.*_"+num_region+"_.*")){
                //System.out.println("Dans getTds : "+ num_region + " " + i);
                return i;
            }
        }
        return -1;
    }

    public static class Result {     //Pour renvoyer plusieurs valeurs dans la fonction is_in_tds
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

    //Pour renvoyer plusieurs valeurs dans la fonction getTypeArgs
    public static class Args {       
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
        //Renvoie l'attribut de l'élément passé en paramètre
    public static String getAttribut(String x, List<List> tds_list, int num_region){
        int i = getTds(num_region, tds_list);       //Récupère le numéro de la tds avec le num de la région
        if (i == -1){
            return null;
        }
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
    // Affiche la tds plus proprement, par ordre croissant des numéros de région
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
            //System.out.println("\n" + tds.get(0).get(0) + " :");
            for (int j = 1; j < tds.size(); j++){
                List<String> tds_region = tds.get(j);
                //System.out.println(tds_region);
            }
        }

    }
    //Renvoie le nombre et le type des arguments de la fonction passée en argument
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

    public static List<String> getDECLARATION(String idf, List<List> liste_tds){
        List<String> liste = new ArrayList<String>();
        for (int i = 0; i < liste_tds.size(); i++) {
            List<List> tds = liste_tds.get(i);
            for (int j = 1; j < tds.size(); j++) {
                List<String> ligne = tds.get(j);
                    if (ligne.get(0).equals(idf) && (ligne.get(1).equals("VAR") || ligne.get(1).equals("PARAM") ||  ligne.get(1).equals("COMPT")))
                    {
                    liste=ligne;
                    }
                }
            }
            return liste;
        }
    


    // Renvoie le type des éléments de la matrice passée en paramtètre
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


    public static int getNbFils(String x, List<List> liste_tds) {
        for (int i = 0; i < liste_tds.size(); i++) {
            List<List> tds = liste_tds.get(i);
            for (int j = 1; j < tds.size(); j++) {
                List<String> ligne = tds.get(j);
                if (ligne.get(0).equals(x) && ligne.get(1).equals("METHOD")) {
                    return Integer.valueOf(ligne.get(3));
                }
            }
        }
        return -1;
    }

    public static int getRegion(){
        return num_region;
    }

    public static int getImbrication(){
        return num_imbrication;
    }

    public static void setRegion(int num_region){
        num_region = num_region;
    }

    public static void setImbrication(int num_imbrication){
        num_imbrication = num_imbrication;
    }

    public static void write(String x){
        writer.println(x);
    }

    public static void setFonctionEtudiee(String x){
        fonction_etudiee = x;
    }

    public static String getFonctionEtudiee(){
        return fonction_etudiee;
    }

    public static void setTds(List<List> tdss){
        tds = tdss; // instanciation tds
    }

    public static List<List> getTds(){
        return tds;
    }

    public static void setwrite(){
        try {
            writer = new PrintWriter("out/output.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void closewrite(){
        writer.close();
    }

    public static String getType(String name, List<List> list_tds) {
        for (int i=0 ; i < list_tds.size() ; i++){
            List<List> tds = list_tds.get(i);
            for (int j = 0; j < tds.size(); j++){   //Pour chaque ligne de la tds
                List<String> tds_region = tds.get(j);
                for (int k = 0; k < tds_region.size(); k++){    //Pour chaque élément de la TDS
                    String tds_region_var = tds_region.get(k);
                    if (tds_region_var.equals(name)){       //Si la variable est dans la TDS
                        String attr = tds_region.get(1);    //On récupère son attribut
                        if (tds_region.size() > 2 && attr != null && (attr.equals("VAR") || attr.equals("PARAM") || attr.equals("METHOD") || attr.equals("TYPEARRAY"))){
                            return tds_region.get(2);
                        } else if (tds_region.size() == 2){
                            return "";
                        } else if(attr.equals("COMPT")){
                            return "int";
                        } else {
                            return null;
                        }
                    }
                }
            }
    }
        return null;
    }


    // Retourne type du paramètre x de la fonction donnée en paramètre
    public static String getTypeParam(String fonction, int x, List<List> list_tds) { 
        for (int i=0 ; i < list_tds.size() ; i++){
            List<List> tds = list_tds.get(i);
            for (int j = 0; j < tds.size(); j++){   //Pour chaque ligne de la tds
                List<String> tds_region = tds.get(j);
                for (int k = 0; k < tds_region.size(); k++){    //Pour chaque élément de la TDS
                    String tds_region_var = tds_region.get(k);
                    if (tds_region_var.equals(fonction) && tds_region.get(1).equals("METHOD")){       //Si la variable est dans la TDS
                        if (tds_region.size() > x+4){
                            return tds_region.get(x+4);
                        } else {
                            return null;
                        }
                    }
                }
            }
    }
        return null;
    }



     //Renvoie l'attribut de l'élément passé en paramètre sans numéro de région
     public static String getAttribut(String name, List<List> list_tds){
        for (int i=0 ; i < list_tds.size() ; i++){
            List<List> tds = list_tds.get(i);
            for (int j = 0; j < tds.size(); j++){   //Pour chaque ligne de la tds
                List<String> tds_region = tds.get(j);
                for (int k = 0; k < tds_region.size(); k++){    //Pour chaque élément de la TDS
                    String tds_region_var = tds_region.get(k);
                    if (tds_region_var.equals(name)){       //Si la variable est dans la TDS
                        return tds_region.get(1);    //On retourne son attribut
                    }
                }
            }
    }
        return null;
    }

}

