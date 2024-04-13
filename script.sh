echo "Build project..."
mvn clean package -DskipTests

echo "Running JAR..."
java -cp target/lang-antlr-1-jar-with-dependencies.jar org.compiler.LangAntlr.LangAntlrInit "$1"

