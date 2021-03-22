#!/bin/bash
FOLDER=../efilter/src/main/java/com/eurotech/filter/parser
GRAMMAR=Filter
java -jar antlr-4.9.2-complete.jar -visitor $FOLDER/$GRAMMAR.g4 
python3 package-grammar.py 
javac $FOLDER/$GRAMMAR*.java
