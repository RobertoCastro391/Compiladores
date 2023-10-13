#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Por favor, forneça o exemplo a ser compilado como argumento."
  exit 1
fi

cd ../src/Grammar2
rm -f Output.java

cd ../Grammar1

java TablanMain ../../examples/"$1" >> ../Grammar2/Output.java

cd ../Grammar2/Grammar2
javac *.java

cd ..

javac *.java
