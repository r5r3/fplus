# this Makefile generates the Parser and extracts the antlr runtime from the jar file

ANTLR4JAR=antlr-4.1-complete.jar
ANTLR4=java -jar $(ANTLR4JAR)

all: runtime generated

runtime: $(ANTLR4JAR)
	mkdir -p runtime
	unzip -d runtime $(ANTLR4JAR) "org/antlr/runtime/*"

generated: fplus.g4 $(ANTLR4JAR)
	mkdir -p generated
	$(ANTLR4) -o generated -package org.fplus.parser fplus.g4
	mkdir -p ../src/org/fplus/parser
	cp generated/*.java generated/*.tokens ../src/org/fplus/parser/.
	javac -cp $(ANTLR4JAR) generated/*.java

clean:
	rm -rf generated
	rm -rf runtime
