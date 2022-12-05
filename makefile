
parser :
	java -jar ./lib/antlr-4.9.2-complete.jar ./expr.g4 -no-listener -visitor -o ./src/parser

compile :
	javac -cp ./lib/antlr-4.9.2-complete.jar:./src ./src/Main.java -d ./bin

run :
	java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main $(target)

test :
	make compile ; 
	make run target=./examples/example_compute.exp ;
	dot -Tsvg ./out/tree.dot -o ./out/tree.svg


