
# Compilador Lang

Desenvolvimento de um compilador para a linguagem Lang

## Stack utilizada

Java, Antlr4



## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/wellingtonengps/lang-compiler
```

Entre no diretório do projeto

```bash
  cd lang-compiler
```

### Build do projeto sem script

```bash
  mvn clean package
```

Build do projeto sem testes

```bash
  mvn clean package -DskipTests
```

Utilizando o JAR:

Você deve passar o arquivo de entrada como argumento para o comando

O arquivo JAR está localizado em target/lang-antlr-1-jar-with-dependencies.jar

```bash
  java -cp target/lang-compiler-1-jar-with-dependencies.jar org.compiler.Lang.lexer.LangInit <arquivo de entrada>
```

Exemplo:

```bash
  java -cp target/lang-compiler-1-jar-with-dependencies.jar org.compiler.Lang.lexer.LangInit src/test/testes/lexico/certo/attrADD.lan

```
### Build do projeto com script

O script build.sh foi criado para facilitar a compilação do projeto, para executá-lo basta rodar o comando abaixo:
Ele exculta o comando mvn clean package -DskipTests e depois executa o comando java -cp target/lang-antlr-1-jar-with-dependencies.jar org.compiler.Lang.lexer.LangInit <arquivo de entrada>

Você deve passar o arquivo de entrada como argumento para o script

```bash
  ./script.sh <arquivo de entrada>
```
Exemplo:

```bash
  ./script.sh src/test/testes/lexico/certo/attrADD.lan
```
