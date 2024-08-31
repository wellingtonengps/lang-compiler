/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package org.compiler.Lang.interpreter.ast;

import org.compiler.Lang.interpreter.Visitor;

import java.util.List;

public class Data extends Node{
    /*************************************************************************
     *              Regra                                                    *
     *      data: DATA_TYPE NAME_TYPE OPEN_BRACES decl* CLOSE_BRACES         *
     *                  # DataDeclaration                                    *
     *                                                                       *
     * Expressa os tipos de dados novos(data 'Nome') criados pelo usuário    *
    **************************************************************************/
    /**
     * Exemplo:
     * data Teste{
     * -- Declarações
     *  2 :: Int;
     *  'a' :: Char;
     * }
     */

    private String nameType;            // Captura o nome de tipo
    private List<Declaration> declarations;    // Declarações

    public Data(int line, int column, String nameType, List<Declaration> declarations){
        super(line, column);
        this.nameType = nameType;
        this.declarations = declarations;
    }

    public void addDeclaration(Declaration declaration){
        this.declarations.add(declaration);
    }

    public Declaration getDeclarationByPosition(int position){
        return this.declarations.get(position);
    }

    public void setNameType(String nameType){
        this.nameType = nameType;
    }

    public List<Declaration> getDeclarations() {
        return this.declarations;
    }

    public String getNameType(){
        return this.nameType;
    }

    public String getId() {
        return nameType;
    }

    @Override
    public String toString(){
        String s = "data " + this.nameType + " { \n";
        for (Declaration declaration : declarations) {
            s += declaration.toString() + "\n";
        }
        s += " } ";
        return s;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
