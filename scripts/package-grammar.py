import os                                                                   
import glob                                                                 

FOLDER = '../efilter/src/main/java/com/eurotech/filter/parser'
HEADER = 'package com.eurotech.filter.parser;\n'

os.chdir(FOLDER)       
for file in list(glob.glob('*.java')):                                                                          
    with open(file, 'r') as original: data = original.read()
    with open(file, 'w') as modified: modified.write(f"{HEADER}{data}")