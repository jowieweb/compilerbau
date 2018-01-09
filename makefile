ANTLR = java -Xmx500M org.antlr.v4.Tool
GRUN = java org.antlr.v4.gui.TestRig

init:
	export CLASSPATH=".:/home/nils/Dokumente/Studium/Master/2. Semester/Compilerbau/antlr-4.7-complete.jar:$CLASSPATH"

all: init
	$(ANTLR) JavaLexer.g4
	javac *java

run: all
	$(GRUN) JavaLexer r test/Kreis.java -tokens

gui: all
	$(GRUN) JavaLexer r test/Kreis.java -gui
