#!/bin/bash

rm -rf build
mkdir -p build

javac -d build -cp ".:src/mysql-connector-j-9.7.0.jar" src/*/*.java src/*.java

java -cp "build:src/mysql-connector-j-9.7.0.jar" App