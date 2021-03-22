#!/bin/bash
PWD=$(pwd)
FOLDER=../efilter/src/main/java/com/eurotech/filter/parser
TESTFOLDER=../efilter/src/main/antlr4/com/eurotech/filter
GRAMMAR=Filter
java -jar antlr-4.9.2-complete.jar -visitor $TESTFOLDER/$GRAMMAR.g4 
python3 package-grammar.py 
javac $TESTFOLDER/$GRAMMAR*.java
cd $TESTFOLDER && java org.antlr.v4.gui.TestRig $GRAMMAR start -gui
#cd $PWD && cp $TESTFOLDER/$GRAMMAR.g4 $FOLDER/$GRAMMAR.g4
#cd $PWD && sh compile-grammar.sh