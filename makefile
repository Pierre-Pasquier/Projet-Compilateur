<<<<<<< HEAD

parser :
	java -jar ./lib/antlr-4.9.2-complete.jar ./expr.g4 -no-listener -visitor -o ./src/parser

compile :
	javac -cp ./lib/antlr-4.9.2-complete.jar:./src ./src/Main.java -d ./bin

run :
	java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main $(target)

test :
	make compile ; 
	make run target=./examples/example1_correct.exp ;
	dot -Tsvg ./out/tree.dot -o ./out/tree.svg

arbre :
	java -jar ./lib/antlr-4.9.2-complete.jar;
	java -jar ./lib/antlr-4.9.2-complete.jar expr.g4 -no-listener -no-visitor -o ./src/parser;
	javac -cp ./lib/antlr-4.9.2-complete.jar:./src ./src/Main_grammaire.java -d ./bin;
	java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main_grammaire ./examples/example1_correct.exp
=======
java -jar ./lib/antlr-4.9.2-complete.jar
java -jar ./lib/antlr-4.9.2-complete.jar expr.g4 -no-listener -no-visitor -o ./src/parser
javac  -cp ./lib/antlr-4.9.2-complete.jar:./src ./src/Main.java -d ./bin
java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./examples/example5_correct.exp
>>>>>>> dc74228074a85edff6bc5f7c66ead2d8fae4b732
