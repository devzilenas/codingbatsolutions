ECHO "Building file list."
dir /s /B *.java > sources.txt
ECHO "Compilation in progress."
javac @sources.txt
ECHO "Compilation finished. Cleaning up."
del sources.txt
