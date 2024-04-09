
# Compilador Lang

Desenvolvimento de um compilador para a linguagem Lang

## Stack utilizada

Java, Antlr4



## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/wellingtonengps/lang-antlr4
```

Entre no diretório do projeto

```bash
  cd lang-antlr4
```

Instale as dependências

```bash
  mvn clean package
```

Utilizando o JAR:

```bash
  java -cp target/lang-antlr-1-jar-with-dependencies.jar org.compiler.LangAntlr.LangAntlrInit
```

O prompt ficará aguardando a entrada de um código em Lang. Para sair, basta digitar `ctrl+d` para inserir um final de arquivo e finalizar.