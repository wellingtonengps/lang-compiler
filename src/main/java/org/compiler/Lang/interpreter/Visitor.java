/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package org.compiler.Lang.interpreter;

import org.compiler.Lang.interpreter.ast.*;

public abstract class Visitor {


    public abstract void visit(Program p);


    public abstract void visit(Data d);

    public abstract void visit(Declaration d);


    public abstract void visit(Function f);


    public abstract void visit(Parameters p);

    public abstract void visit(TypeArray t);


    public abstract void visit(TypeInt t);
    public abstract void visit(TypeChar t);
    public abstract void visit(TypeBool t);
    public abstract void visit(TypeFloat t);
    public abstract void visit(Type t);
    public abstract void visit(NameType i);


    public abstract void visit(Command c);
    public abstract void visit(CommandsList c);
    public abstract void visit(If i);
    public abstract void visit(IfElse i);
    public abstract void visit(Iterate i);
    public abstract void visit(Read r);
    public abstract void visit(Print i);
    public abstract void visit(Return r);
    public abstract void visit(Attribution a);
    public abstract void visit(FunctionCall f);


    public abstract void visit(And a);


    public abstract void visit(LessThan l);
    public abstract void visit(Equality e);
    public abstract void visit(Difference n);


    public abstract void visit(Addition a);
    public abstract void visit(Subtraction s);


    public abstract void visit(Multiplication m);
    public abstract void visit(Division d);
    public abstract void visit(Modular m);


    public abstract void visit(Not n);
    public abstract void visit(Minus n);
    public abstract void visit(BooleanValue b); // True e False
    public abstract void visit(Null n);
    public abstract void visit(IntegerNumber i);
    public abstract void visit(FloatNumber p);
    public abstract void visit(CharLitteral c);


    public abstract void visit(PexpIdentifier i);
    public abstract void visit(ExpParenthesis e);
    public abstract void visit(TypeInstanciate t);
    public abstract void visit(FunctionReturn f);


    public abstract void visit(LValue l);
    public abstract void visit(ID i);
    public abstract void visit(Identifier i);
    public abstract void visit(DataAccess d);
    public abstract void visit(ArrayAccess a);


    public abstract void visit(FCallParams f);
}
