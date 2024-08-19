echo "Build project..."
mvn clean package -DskipTests

echo "Running JAR..."
java -cp target/lang-compiler-1-jar-with-dependencies.jar org.compiler.Lang.lexer.LangInit $1