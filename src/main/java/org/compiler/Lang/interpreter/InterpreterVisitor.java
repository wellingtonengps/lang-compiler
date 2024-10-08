/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */


package org.compiler.Lang.interpreter;

import org.compiler.Lang.interpreter.ast.*;

import java.util.*;

public class InterpreterVisitor extends Visitor{
    private Stack<HashMap<String, Object>> env; // Escopo de variaveis de objetos
    private HashMap<String, Function> funcs; // Funções da linguagem lang
    private HashMap<String, Data> datas; // Tipos de dados novos
    private Stack<Object> operands; // Operandos
    private Stack<Object> parms; // Parametros de funções
    private boolean retMode;

    public InterpreterVisitor() {
        env = new Stack<HashMap<String, Object>>();
        env.push(new HashMap<String, Object>());
        funcs = new HashMap<String, Function>();
        parms = new Stack<Object>();        //parms = new HashMap<Integer, Object>();
        datas = new HashMap<String, Data>();
        operands = new Stack<Object>();
        retMode = false;
    }


    @Override
    public void visit(Program p) {
        Node main = null;

        if (p.getDatas() != null) {
            for (Data data : p.getDatas()) {
                datas.put(data.getId(), data);
            }
        }

        for (Function f : p.getFunctions()) {
            funcs.put(f.getId(), f);
            if (f.getId().equals("main_")) {
                main = f;
            }
        }

        if (main == null) {
            throw new RuntimeException("Não há uma função chamada \'main\'!");
        }

        main.accept(this);
    }


    @Override
    public void visit(Data d) {
    }

    @Override
    public void visit(Declaration d) {

    }

    // Partem do func

    @Override
    public void visit(Function f) {
        // Cria um escopo local
        HashMap<String, Object> localEnv = new HashMap<String, Object>();
        if (f.getParameters() != null) {
            Parameters params = f.getParameters();
            params.accept(this);    // Empilha os valores dos parametros no operands

            // Adiciona as variaveis do parametro no escopo local
            for (int i = 0; i < f.getParameters().size(); i++) {
                localEnv.put(params.getSingleId(i), operands.pop());
            }
        }
        // Adiciona o escopo da função no env
        env.push(localEnv);

        // Verifica os commandos que compoem o corpo da função
        for (Command command : f.getCommands()) {
            command.accept(this);
        }

        // Remove o escopo local criado pra função
        env.pop();
        
        // remover o ambiente local
        retMode = false;
    }

    @Override
    public void visit(Parameters p) {
        try {
            // Verifica os tipos de cada parâmetro da função
            for (Type type : p.getType()) {
                // Aceita o tipo do parametro e empilha o valor do parametro no operands
                type.accept(this);
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + p.getLine() + ", " + p.getColumn() + ") " + x.getMessage());
        }
    }

    // Partem do Type

    @Override
    public void visit(TypeArray t) {
        try {
            boolean ehParametro = false;
            // Empilha os parametros de função
            if(parms.size() != 0){          // Se há parametros
                // Desempilha o parametro da função e adiciona nos operands
                operands.push(parms.pop());  // Empilha somente o tipo que está no topo
                ehParametro = true;
            }
            if(ehParametro == false){  // Não é função, é um instanciamento de tipo
                operands.push(t);           // Empilha o tipo no operands para que ele seja pego no TypeInstan
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + t.getLine() + ", " + t.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(TypeInt t) {
        try {
            boolean ehParametro = false;
            // Empilha os parametros de função
            if(parms.size() != 0){          // Se há parametros
                // Desempilha o parametro da função e adiciona nos operands
                operands.push(parms.pop());  // Empilha somente o tipo que está no topo
                ehParametro = true;
            }
            if(ehParametro == false){  // Não é função, é um instanciamento de tipo
                operands.push(t);           // Empilha o tipo no operands para que ele seja pego no TypeInstan
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + t.getLine() + ", " + t.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(TypeChar t) {
        try {
            boolean ehParametro = false;
            if(parms.size() != 0){          // Se há parametros
                // Desempilha o parametro da função e adiciona nos operands
                operands.push(parms.pop());  // Empilha somente o tipo que está no topo
                ehParametro = true;
            }
            if(ehParametro == false){  // Não é função, é um instanciamento de tipo
                operands.push(t);           // Empilha o tipo no operands para que ele seja pego no TypeInstan
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + t.getLine() + ", " + t.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(TypeBool t) {
        try {
            boolean ehParametro = false;
            if(parms.size() != 0){          // Se há parametros
                // Desempilha o parametro da função e adiciona nos operands
                operands.push(parms.pop());  // Empilha somente o tipo que está no topo
                ehParametro = true;
            }
            if(ehParametro == false){  // Não é função, é um instanciamento de tipo
                operands.push(t);           // Empilha o tipo no operands para que ele seja pego no TypeInstan
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + t.getLine() + ", " + t.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(TypeFloat t) {
        try {
            boolean ehParametro = false;
            if(parms.size() != 0){          // Se há parametros
                // Desempilha o parametro da função e adiciona nos operands
                operands.push(parms.pop());  // Empilha somente o tipo que está no topo
                ehParametro = true;
            }
            if(ehParametro == false){  // Não é função, é um instanciamento de tipo
                operands.push(t);           // Empilha o tipo no operands para que ele seja pego no TypeInstan
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + t.getLine() + ", " + t.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(NameType n) {
        try {
            boolean ehParametro = false;
            if(parms.size() != 0){          // Se há parametros
                // Desempilha o parametro da função e adiciona nos operands
                operands.push(parms.pop());  // Empilha somente o tipo que está no topo
                ehParametro = true;
            }
            if(ehParametro == false){  // Não é função, é um instanciamento de tipo
                operands.push(n);           // Empilha o tipo no operands para que ele seja pego no TypeInstan
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(Type t) {
    }

    @Override
    public void visit(Command c) {
        try {
            c.accept(this); // Executa o comando
        } catch (Exception x) {
            throw new RuntimeException(" (" + c.getLine() + ", " + c.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(CommandsList c) {
        if (retMode) {
            return;
        }
        try {
            for (Command command : c.getCommands()) {
                command.accept(this);

                if (retMode) {
                    return;
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + c.getLine() + ", " + c.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(If i) {
        try {
            i.getExp().accept(this);

            // Desempilha os operandos com "parametro" do if
            if ((boolean) operands.pop()) {
                i.getCmd().accept(this); // Verifica se o corpo de comandos do if é aceito
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + i.getLine() + ", " + i.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(IfElse i) {
        try {
            i.getExp().accept(this);

            // Desempilha os operandos com "parametro" do if
            if ((boolean) operands.pop()) {
                i.getCmd().accept(this); // Verifica se o corpo de comandos do if é aceito
            } else {
                i.getElseCmd().accept(this);
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + i.getLine() + ", " + i.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(Iterate i) {
        try {
            i.getExp().accept(this);        // Empilha o valor lógico da expressão no operands
            Object obj = operands.pop();
            if (obj instanceof Boolean){ // Objeto do tipo booleano na lista de operandos
                do{
                    i.getCmd().accept(this);        // Executa os comandos do iterate
                    i.getExp().accept(this);        // Empilha o criterio de repetição atualizado
                    obj = operands.pop();
                }
                while ((Boolean) obj); // Repito enquanto esse objeto do parametro do iterate for true
            }
            else if (obj instanceof Integer) {
                // Iterate com um número limitado de vezes
                for (int j = 0; j < (Integer) obj; j++) {
                    i.getCmd().accept(this);
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + i.getLine() + ", " + i.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(Read r) {
        try {
            LValue lvalue = r.getLValue();
            Scanner sc = new Scanner(System.in); // Scanner para fazer a leitura de entrada pelo teclado
            String input = sc.nextLine();
            if (lvalue instanceof Identifier) {
                // Adiciona o valor digitado pelo usuário no escopo
                // (Nome da variavel, valor digitado)
                env.peek().put(((Identifier) lvalue).getId(), input);
            } else if (lvalue instanceof DataAccess) {
                if(((DataAccess)lvalue).getLValue() instanceof ArrayAccess){ // array de data
                    // Quando chega array do tipo pontos[0].x => lValue é um dataAccess
                    ArrayAccess arrayElement = ((ArrayAccess)((DataAccess)lvalue).getLValue());
                    arrayElement.getExp().accept(this); // Aceita e adiciona a posicao do array no operandos

                    String nomeAtributo = ((DataAccess)lvalue).getId();
                    Integer position = (Integer)operands.pop();

                    // o array é um list de elementos
                    String nomeArray = arrayElement.getId();

                    // Busca o array no env
                    List<Object> objetoArray = ((List<Object>) env.peek().get(nomeArray));
                    Integer tamanhoArray = ((List)objetoArray).size();

                    if((position >= 0) && (position <= tamanhoArray - 1)){
                        Object elemento = objetoArray.get(position);    // pega o elemento na posicao
                        ((HashMap<String, Object>) elemento).put(nomeAtributo, input);
                    }
                    else{
                        throw new RuntimeException(" (" + r.getLine() + ", " + r.getColumn() + ") Erro: Acesso a uma posicao invalida no array \'"+nomeArray+"\'  !!!");
                    }
                }
                else{   // Tipo data normal
                    Object obj = env.peek().get(((Identifier) ((DataAccess) lvalue).getLValue()).getId());
                    ((HashMap<String, Object>) obj).put(((DataAccess) lvalue).getId(), input);

                }
            }
            sc.close();     // Fecha o scanner
        } catch (Exception x) {
            throw new RuntimeException(" (" + r.getLine() + ", " + r.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(Print i) {
        try {
            i.getExpression().accept(this);     // Faz a expressão e coloca no operando

            // Tira o objeto da lista de operandos e imprime
            Object obj = operands.pop();
            System.out.print(obj);
        } catch (Exception e) {
            throw new RuntimeException(" (" + i.getLine() + ", " + i.getColumn() + ") " + e.getMessage());
        }
    }

    @Override
    public void visit(Return r) {
        for (Expression exp : r.getExps()) {
            exp.accept(this);
        }
        retMode = true;
    }

    @Override
    public void visit(Attribution a) {
        try {
            a.getExp().accept(this);

            // Variavel que vai ter os dados atribuidos nela
            LValue lvalue = a.getLValue();

            // Se a variavel estiver dentro de um data
            if (lvalue instanceof DataAccess) {

                // Se o lvalue do data for um arrayACCESS
                // Significa que é um ARRAY DE DATA
                if(((DataAccess)lvalue).getLValue() instanceof ArrayAccess){
                    ArrayAccess arrayElement = ((ArrayAccess)((DataAccess)lvalue).getLValue());
                    arrayElement.getExp().accept(this); // Aceita e adiciona a posicao do array no operandos

                    String nomeAtributo = ((DataAccess)lvalue).getId();
                    String nomeObjeto = ((DataAccess)lvalue).getDataId();
                    Integer position = (Integer)operands.pop();
                    // a.getExp().accept(this);            // Passar o valor a ser atribuido pro operands
                    Integer valorAtribuicao = (Integer) operands.pop();

                    // o array é um list de elementos
                    String nomeArray = arrayElement.getId();

                    // Busca o array no env
                    List<Object> objetoArray = ((List<Object>) env.peek().get(nomeArray));
                    Integer tamanhoArray = ((List)objetoArray).size();

                    // System.out.println("461 --- " + objetoArray.toString() + " -- " + nomeAtributo +" -- "+ valorAtribuicao);

                    if((position >= 0) && (position <= tamanhoArray - 1)){
                        Object elemento = objetoArray.get(position);    // pega o elemento na posicao
                        ((HashMap<String, Object>) elemento).put(nomeAtributo, valorAtribuicao);

                    }
                    else{
                        throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") Erro: Acesso a uma posicao invalida no array \'"+nomeArray+"\'  !!!");
                    }
                }
                else{   // Somente o DATA
                    String nomeAtributo = ((DataAccess)lvalue).getId();
                    String nomeObjeto = ((DataAccess)lvalue).getDataId();


                    // Atributo do lado do '='
                    Object atributo = operands.pop();
                    // Busca o objeto no env e adiciona o atributo na variavel dele
                    HashMap<String, Object> objetoDinamico = ((HashMap<String, Object>) env.peek().get(nomeObjeto));

                    // Verifica se o atributo do objeto existe no hashmap
                    if(objetoDinamico.get(nomeAtributo) != null){
                        objetoDinamico.put(nomeAtributo, atributo);
                    }
                    else{
                        // Lança um erro se o atributo não tiver no objeto
                        throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") Erro: Atributo "+ "\'"+nomeAtributo+"\'"+" eh inexistente no objeto " + "\""+nomeObjeto+"\"");
                    }
                }
            } else if (lvalue instanceof Identifier) {
                // Se é um Identificador literal, variavel ou resultados de funções
                // System.out.println("Linha 398 - ATTRIBUTION -- " + lvalue.getId() + " -- " + a.getExp());
                env.peek().put(((Identifier) lvalue).getId(), operands.pop());
            }
            else if(lvalue instanceof ArrayAccess){     // Atribuição a um array

                // o array é um list de elementos
                String nomeArray = ((ArrayAccess)lvalue).getId();
                ((ArrayAccess)lvalue).getExp().accept(this);        // Aceita e adiciona a posicao no operandos
                Integer position = (Integer)operands.pop();         // Posicao do array

                // Busca o array no env
                List<Object> objetoArray = ((List<Object>) env.peek().get(nomeArray));
                Integer tamanhoArray = ((List)objetoArray).size();


                if((position >= 0) && (position <= tamanhoArray - 1)){
                    // Pega o elemento do topo de operands e adiciona na posição do vetor
                    ((List)objetoArray).set(position, operands.pop());
                }
                else{
                    throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") Erro: Acesso a uma posicao invalida no array \'"+nomeArray+"\'  !!!");
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(FunctionCall f) {
        try {
            // Pega a função correspondente
            Function function = funcs.get(f.getId());

            // Garante a existencia da função
            if (f != null) {

                // Passa do operand para o params
                // monta o parametro da função
                if (f.getFCallParams() != null) {
                    int tempID = 0;

                    // Verifica os parametros da função
                    for (Expression exp : f.getFCallParams().getExps()) {
                        exp.accept(this);
                        Object obj = (Object) operands.pop();

                        // Adiciona no topo da pilha de parametros
                        parms.push(obj);
                        tempID++;
                    }
                }
                function.accept(this);  // Executa a função

                // Retorno da função para as duas variaveis determinadas
                if (f.getLValues() != null) {
                    List<LValue> ret = f.getLValues();
                    int it = ret.size() - 1;

                    // Inverte a ordem quando empilha os operadores, logo, deve ser
                    // Desempilhado do direita pra esquerda
                    for (LValue l : ret) {
                        env.peek().put(ret.get(it).getId(), operands.pop());
                        it--;
                    }
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + f.getLine() + ", " + f.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(And a) {
        try {
            a.getLeft().accept(this);
            a.getRight().accept(this);
            boolean right = (Boolean) operands.pop();
            boolean left = (Boolean) operands.pop();
            operands.push(left && right);
        } catch (Exception x) {
            throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(LessThan l) {
        try {
            l.getLeft().accept(this);
            l.getRight().accept(this);
            Object right = operands.pop();
            Object left = operands.pop();
            if (left instanceof Float && right instanceof Float) {
                if (((Float) left) < ((Float) right)) {
                    operands.push(true);
                } else {
                    operands.push(false);
                }
            } else if (left instanceof Integer && right instanceof Integer) {
                if (((Integer) left) < ((Integer) right)) {
                    operands.push(true);
                } else {
                    operands.push(false);
                }
            } else{
                throw new RuntimeException(" (" + l.getLine() + ", " + l.getColumn() + ") : Expressoes invalidas na operacao de comparacao menor com \'<\' !!");
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + l.getLine() + ", " + l.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(Equality e) {
        try {
            e.getLeft().accept(this);
            e.getRight().accept(this);
            Object right = operands.pop();
            Object left = operands.pop();
            if(left instanceof Boolean && right instanceof Boolean){
                if (left == right) {
                    operands.push(true);
                } else {
                    operands.push(false);
                }
            }
            else{
                if (left instanceof Float && right instanceof Float) {
                    if (((Float) left) == ((Float) right)) {
                        operands.push(true);
                    } else {
                        operands.push(false);
                    }
                } else if (left instanceof Integer && right instanceof Integer) {
                    if (((Integer) left) == ((Integer) right)) {
                        operands.push(true);
                    } else {
                        operands.push(false);
                    }
                } else{
                    throw new RuntimeException(" (" + e.getLine() + ", " + e.getColumn() + ") : Expressoes invalidas na operacao de igualdade de comparacao usando \'==\' !!");
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + e.getLine() + ", " + e.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(Difference n) {
        try {
            n.getLeft().accept(this);
            n.getRight().accept(this);
            Object right = operands.pop();
            Object left = operands.pop();
            if(left instanceof Boolean && right instanceof Boolean){
                if (left != right) {
                    operands.push(true);
                } else {
                    operands.push(false);
                }
            }
            else{
                if (left instanceof Float && right instanceof Float) {
                    if (((Float) left) != ((Float) right)) {
                        operands.push(true);
                    } else {
                        operands.push(false);
                    }
                } else if (left instanceof Integer && right instanceof Integer) {
                    if (((Integer) left) != ((Integer) right)) {
                        operands.push(true);
                    } else {
                        operands.push(false);
                    }
                } else{
                    throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") : Expressoes invalidas na operacao de diferencao na comparacao usando \'!=\' !!");
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") " + x.getMessage());
        }
    }

    // Partem do aexp

    @Override
    public void visit(Addition a) {
        try {
            a.getLeft().accept(this);
            a.getRight().accept(this);
            Object right = operands.pop();
            Object left = operands.pop();
            if (left instanceof Float || right instanceof Float) {
                operands.push((Float) left + (Float) right);
            } else if (left instanceof Integer && right instanceof Integer) {
                operands.push((Integer) left + (Integer) right);
            } else{
                throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") : Expressoes invalidas na operacao de adicao \'+\' !");
            }
        } catch (Exception e) {
            throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") " + e.getMessage());
        }
    }

    @Override
    public void visit(Subtraction s) {
        try {
            s.getLeft().accept(this);
            s.getRight().accept(this);
            // Primeiro é empilhado da esquerda pra direita, logo, o topo da pilha
            // é o operando da direita
            Object right = operands.pop();
            Object left = operands.pop();
            if (left instanceof Float || right instanceof Float) {
                operands.push((Float) left - (Float) right);
            } else if (left instanceof Integer && right instanceof Integer) {
                operands.push((Integer) left - (Integer) right);
            } else{
                throw new RuntimeException(" (" + s.getLine() + ", " + s.getColumn() + ") : Expressoes invalidas na operacao de subtracao \'-\' !");
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + s.getLine() + ", " + s.getColumn() + ") " + x.getMessage());
        }
    }

    // Partem do mexp
    @Override
    public void visit(Multiplication m) {
        try {
            m.getLeft().accept(this);
            m.getRight().accept(this);
            // Primeiro é empilhado da esquerda pra direita, logo, o topo da pilha
            // é o operando da direita
            Object right = operands.pop();
            Object left = operands.pop();
            if (left instanceof Float || right instanceof Float) {
                operands.push((Float) left * (Float) right);
            } else if (left instanceof Integer && right instanceof Integer) {
                operands.push((Integer) left * (Integer) right);
            } else{
                throw new RuntimeException(" (" + m.getLine() + ", " + m.getColumn() + ") : Expressoes invalidas na operacao de multiplicacao \'*\' !!");
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + m.getLine() + ", " + m.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(Division d) {
        try {
            d.getLeft().accept(this);
            d.getRight().accept(this);
            // Primeiro é empilhado da esquerda pra direita, logo, o topo da pilha
            // é o operando da direita
            Object right = operands.pop();
            Object left = operands.pop();
            if (left instanceof Float || right instanceof Float) {
                operands.push((Float) left / (Float) right);
            } else if (left instanceof Integer && right instanceof Integer) {
                operands.push((Integer) left / (Integer) right);
            } else{
                throw new RuntimeException(" (" + d.getLine() + ", " + d.getColumn() + ") : Expressoes invalidas na operacao de divisao \'/\' !!");
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + d.getLine() + ", " + d.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(Modular m) {
        try {
            m.getLeft().accept(this);
            m.getRight().accept(this);
            Object right = operands.pop();
            Object left = operands.pop();
            if (left instanceof Float || right instanceof Float) {
                operands.push((Float) left % (Float) right);
            } else if (left instanceof Integer && right instanceof Integer) {
                operands.push((Integer) left % (Integer) right);
            } else{
                throw new RuntimeException(" (" + m.getLine() + ", " + m.getColumn() + ") : Expressoes invalidas na operacao de divisao modular \'%\' !!");
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + m.getLine() + ", " + m.getColumn() + ") " + x.getMessage());
        }
    }

    // Partem do sexp

    @Override
    public void visit(Not n) {
        try {
            n.getExpression().accept(this);
            Object valor = operands.pop();
            if(valor instanceof Boolean){
                operands.push(!(boolean) valor);
            }
            else{
                throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") : Expressao invalida na operacao \'!\' em tipos logicos !!");
            }
        } catch (Exception e) {
            throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") " + e.getMessage());
        }
    }

    @Override
    public void visit(Minus n) {
        try {
            n.getExpression().accept(this);
            Object valor = operands.pop();
            if (valor instanceof Float) {
                operands.push((Float) valor * -1);
            } else if (valor instanceof Integer) {
                operands.push((Integer) valor * -1);
            } else{
                throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") : Expressao invalida na operacao de inversao de sinal numerico \'-\' !!");
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(BooleanValue b) { // True e False
        try {
            operands.push(b.getValue());
        } catch (Exception e) {
            throw new RuntimeException(" (" + b.getLine() + ", " + b.getColumn() + ") " + e.getMessage());
        }
    }

    @Override
    public void visit(Null n) {
        try {
            operands.push(n.getValue());
        } catch (Exception x) {
            throw new RuntimeException(" (" + n.getLine() + ", " + n.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(IntegerNumber i) {
        try {
            operands.push(i.getValue());
        } catch (Exception e) {
            throw new RuntimeException(" (" + i.getLine() + ", " + i.getColumn() + ") " + e.getMessage());
        }
    }

    @Override
    public void visit(FloatNumber p) {
        try {
            operands.push(p.getValue());
        } catch (Exception x) {
            throw new RuntimeException(" (" + p.getLine() + ", " + p.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(CharLitteral c) {
        try {
            operands.push(c.getValue());
        } catch (Exception x) {
            throw new RuntimeException(" (" + c.getLine() + ", " + c.getColumn() + ") " + x.getMessage());
        }
    }

    // Partem do pexp

    @Override
    public void visit(PexpIdentifier i) {

    }

    @Override
    public void visit(ExpParenthesis e) {

    }

    @Override
    public void visit(TypeInstanciate t) {
        try {
            // Garante que não é um tipo Data
            if(t.getType() != null){
                if (t.getExp() != null) {
                    t.getType().accept(this);           // Empilha o tipo no operand
                    t.getExp().accept(this);            // Executa exp passando o tamanho do vetor para operands

                    // Trata a condição de ser array do tipo DATA
                    if(t.getType() instanceof NameType){

                        // Pega o tamanho do vetor na pilha de operandos
                        Integer i = (Integer) operands.pop();       // Tamanho do array já foi visto
                        Object obj = operands.pop();                // Tipo do array -> Int, Float, Char ....
                        List<Object> lista = new ArrayList<Object>(i); // Tipo array
                        for (int k = 0; k < i; k++) {
                            lista.add(obj);
                        }
                        operands.push(lista);
                    }
                    else{       // Array generico
                        // Pega o tamanho do vetor na pilha de operandos
                        Integer i = (Integer) operands.pop();       // Tamanho do array já foi visto

                        Object obj = operands.pop();                // Tipo do array -> Int, Float, Char ....

                        List<Object> lista = new ArrayList<Object>(i); // Tipo array
                        for (int k = 0; k < i; k++) {
                            lista.add(obj);
                        }
                        operands.push(lista);
                    }
                }
                else{   // É um tipo de dado comum: Int, Float, Char

                    Object valorPadrao = new ObjectDefault(t.getLine(), t.getColumn(), t.getType());
                    operands.push(valorPadrao);
                }
            }
            else{   // Tipo data que no qual o atributo Type é null
                if (t.getExp() == null) {                   // Tipo normal de data
                    // Pega o nome do objeto do Data
                    String dataID = t.getDataName();

                    // Cria um Hashmap pra servir de alocação variaveis para o objeto
                    HashMap<String, Object> newVar = new HashMap<String, Object>();

                    for (Declaration d : datas.get(dataID).getDeclarations()) {
                        // Verifica as declarações das variaveis e tipos no data
                        d.getType().accept(this);

                        // Desempilha os tipos que estão presenta no operands
                        operands.pop();

                        // Cria um objeto especial para destacar quais variaveis e seu tipo
                        // dentro do data
                        Object valorPadrao = new ObjectDefault(t.getLine(), t.getColumn(),
                                d.getId(), d.getType());

                        // Adiciona o objeto com as variaveis vazias
                        newVar.put(d.getId(), valorPadrao);    // Adiciona um objeto vazio
                    }
                    operands.push(newVar);
                }
                else{   // Trata a condição de ser array do tipo DATA
                    t.getExp().accept(this);            // Executa exp passando o tamanho do vetor para operands
                    // Pega o nome do objeto do Data
                    String dataID = t.getDataName();

                    // Pega o tamanho do vetor na pilha de operandos
                    Integer i = (Integer) operands.pop();       // Tamanho do array já foi visto

                    List<Object> lista = new ArrayList<Object>(i); // Tipo array

                    for (int k = 0; k < i; k++) {
                        // Cria um Hashmap pra servir de alocação variaveis para o objeto
                        HashMap<String, Object> newVar = new HashMap<String, Object>();
                        for (Declaration d : datas.get(dataID).getDeclarations()) {
                            // Cria um objeto especial para destacar quais variaveis e seu tipo
                            // dentro do data
                            Object valorPadrao = new ObjectDefault(t.getLine(), t.getColumn(),
                                    d.getId(), d.getType());

                            // Adiciona o objeto com as variaveis vazias
                            newVar.put(d.getId(), valorPadrao);    // Adiciona um objeto vazio
                        }
                        lista.add(newVar);
                    }
                    operands.push(lista);
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + t.getLine() + ", " + t.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(FunctionReturn f) {
        try {
            // Pega a função correspondente
            Function function = funcs.get(f.getId());

            // Garante a existencia da função
            if (f != null) {
                if (f.getFCallParams() != null) {
                    int tempID = 0;

                    // Verifica os parametros da função
                    for (Expression exp : f.getFCallParams().getExps()) {
                        exp.accept(this);               // Adiciona o valor do parametro no operands
                        Object obj = (Object) operands.pop();

                        // Adiciona o parametro na listagem
                        // parms.put(tempID, obj);
                        parms.push(obj);    // Adiciona no topo da pilha de parametros
                        tempID++;
                    }
                }

                // Executa a função e coloca o retorno dos parametros em operands
                function.accept(this);

                // Pega o valor da posicão da que identifica qual variavel o
                // usuario quer que seja retornada
                IntegerNumber valueReturnedPos = (IntegerNumber) f.getExpIndex();

                // Desempilha e pega somente a posicao da variavel identificada pelo usuario
                // Verifica se a função tem dois retornos
                if(function.getReturnTypes().size() == 2){
                    if ((Integer) valueReturnedPos.getValue() == 0 ||
                            (Integer) valueReturnedPos.getValue() == 1
                    ) {
                        // Remove os retorno[1] caso o valor informado for [0]
                        if ((Integer) valueReturnedPos.getValue() == 0) {
                            operands.pop();
                        }

                    } else {
                        throw new RuntimeException(" (" + f.getLine() + ", " + f.getColumn()
                                + ") Acesso a posicao invalida de elemento no retorno da funcao");
                    }
                }
                else if(function.getReturnTypes().size() == 1){ // Quando tiver somente 1 retorno
                    if ((Integer) valueReturnedPos.getValue() == 0) {

                        // Não faz nada pois o valor de retorno já está no operands

                    } else {
                        throw new RuntimeException(" (" + f.getLine() + ", " + f.getColumn()
                                + ") Acesso a posicao invalida de elemento no retorno da funcao");
                    }
                }
                else{
                    throw new RuntimeException(" (" + f.getLine() + ", " + f.getColumn()
                            + ") A funcao nao apresenta tipos de retorno");
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + f.getLine() + ", " + f.getColumn() + ") " + x.getMessage());
        }

    }

    // Partem do lvalue

    @Override
    public void visit(LValue l) {

    }

    @Override
    public void visit(ID i) {

    }

    @Override
    public void visit(Identifier i) {
        try {
            Object r = env.peek().get(i.getId());
            if (r != null || (r == null && env.peek().containsKey(i.getId()))) {
                operands.push(r);
            } else {
                // throw new RuntimeException("Erro!");
                throw new RuntimeException(" (" + i.getLine() + ", " + i.getColumn() + ") " + ": Erro no Identifier !!");
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + i.getLine() + ", " + i.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(DataAccess d) {
        try {
            Object obj = env.peek().get(d.getLValue().getId());
            if(d.getLValue() instanceof ArrayAccess){ // array de data
                // Quando chega array do tipo pontos[0].x => d é um dataAccess
                if (obj != null) {
                    // obj chega como uma lista
                    ArrayAccess array = ((ArrayAccess)d.getLValue());
                    array.getExp().accept(this);    // Adiciona a posicao do vetor no operands
                    Integer position = (Integer)operands.pop();
                    String atributoDoObjeto = d.getId();
                    HashMap objeto = (HashMap)((List)obj).get(position);
                    if(objeto.containsKey(atributoDoObjeto)){   // Se o objeto tem o atributo
                        operands.push(objeto.get(atributoDoObjeto));
                    }
                    else{
                        // Atributo que não pertence ao objeto
                        throw new RuntimeException(" (" + d.getLine() + ", " + d.getColumn() + ") Erro: Atributo "+ "\'"+d.getId()+"\'"+" eh inexistente no objeto " + "\""+d.getLValue().getId()+"\" !!!");
                    }
                } else {
                    // Objeto não existe
                    throw new RuntimeException(" (" + d.getLine() + ", " + d.getColumn() + ") Erro: O Objeto "+ "\""+d.getLValue().getId()+"\" nao existe!!!");
                }
            }
            else{       // Data
                if (obj != null) {
                    if (((HashMap<String, Object>) obj).containsKey(d.getId())) {
                        operands.push(((HashMap<String, Object>) obj).get(d.getId()));
                    } else {
                        // Atributo que não pertence ao objeto
                        throw new RuntimeException(" (" + d.getLine() + ", " + d.getColumn() + ") Erro: Atributo "+ "\'"+d.getId()+"\'"+" eh inexistente no objeto " + "\""+d.getLValue().getId()+"\" !!!");
                    }
                } else {
                    // Objeto não existe
                    throw new RuntimeException(" (" + d.getLine() + ", " + d.getColumn() + ") Erro: O Objeto "+ "\""+d.getLValue().getId()+"\" nao existe!!!");
                }
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + d.getLine() + ", " + d.getColumn() + ") " + x.getMessage());
        }
    }

    @Override
    public void visit(ArrayAccess a) {
        try{
            // ---- Regra
            // lvalue: lvalue OPEN_BRACKET exp CLOSE_BRACKET # ArrayAccess

            // obj é uma lista => lista de elementos do array
            Object obj = env.peek().get(a.getLValue().getId());
            if (obj != null) {
                a.getExp().accept(this);        // Adiciona a posicao no vetor nos operands
                Integer position = (Integer) operands.pop();
                Integer tamanhoArray = ((List)obj).size();
                if((position >= 0) && (position <= tamanhoArray - 1)){
                    operands.push(((List)obj).get(position));
                }
                else{
                    throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") Erro: Acesso a uma posicao invalida no array \'"+a.getLValue().getId()+"\'  !!!");
                }
            } else {
                // Array não existe
                throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") Erro: O array "+ "\""+a.getLValue().getId()+"\" nao existe!!!");
            }
        }
        catch (Exception x) {
            throw new RuntimeException(" (" + a.getLine() + ", " + a.getColumn() + ") " + x.getMessage());
        }
    }

    // Partem do exps

    @Override
    public void visit(FCallParams f) {
        try {
            for (Expression expression : f.getExps()) {
                expression.accept(this);
            }
        } catch (Exception x) {
            throw new RuntimeException(" (" + f.getLine() + ", " + f.getColumn() + ") " + x.getMessage());
        }
    }
}
