
#!/bin/bash
 
echo "=== Compiling ==="
javac -cp "lib/*" -d bin src/**/*.java
 
echo "=== Running ==="
java -cp "bin:lib/*" program.Program
 
