package output;

import java.util.Random;

public class EvalVisitor extends GrammarBaseVisitor<Float>{
    @Override public Float visitProgram(GrammarParser.ProgramContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Float visitPrint(GrammarParser.PrintContext ctx) {
        Float value = visit(ctx.expression());

        Integer intValue = value.intValue();

        if ((value - intValue) == 0) {
            System.out.println(intValue);
        } else {
            System.out.println(value);
        }
        return value;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Float visitPOW(GrammarParser.POWContext ctx) {
        Float left = visit(ctx.expression(0));
        Float right = visit(ctx.expression(1));
        return (float) Math.pow(left, right);
    }


    @Override public Float visitADD(GrammarParser.ADDContext ctx) {
        Float left = visit(ctx.expression(0));
        Float right = visit(ctx.expression(1));
        return left + right;
    }

    @Override public Float visitMINUS(GrammarParser.MINUSContext ctx) {
        Float left = visit(ctx.expression(0));
        Float right = visit(ctx.expression(1));
        return left - right;
    }

    @Override public Float visitMUL(GrammarParser.MULContext ctx) {
        Float left = visit(ctx.expression(0));
        Float right = visit(ctx.expression(1));
        return left * right;
    }

    @Override public Float visitDIV(GrammarParser.DIVContext ctx) {
        Float left = visit(ctx.expression(0));
        Float right = visit(ctx.expression(1));
        if (right == 0) {
            System.err.println("divide by zero at: Line " + ctx.getStart().getLine() + ", Position " + ctx.getStart().getCharPositionInLine());
            //System.exit(0);
        }
        return left / right;
    }

    @Override public Float visitNUMBER(GrammarParser.NUMBERContext ctx) {
        return Float.valueOf(ctx.NUMBER().getText());
    }

    // rand
    @Override public Float visitRAND(GrammarParser.RANDContext ctx) {
        Float result = 0f;
        Float min = Float.valueOf(ctx.NUMBER(0).getText());
        Float max = Float.valueOf(ctx.NUMBER(1).getText());
        if (min == max) {
            result = min;
        } else if (min > max) {
            System.err.println("Max musi bejt vetsi!");
            //System.exit(0);
        } else {
            Random r = new Random();
            result = min + r.nextFloat() * (max - min);
        }
        return result;
    }
    // min
    @Override public Float visitMIN(GrammarParser.MINContext ctx) {
        Float min = 0f;
        Float val1 = Float.valueOf(ctx.NUMBER(0).getText());
        Float val2 = Float.valueOf(ctx.NUMBER(1).getText());

        if (val1 > val2) {
            min = val2;
        } else {
            min = val1;
        }
        return min;
    }

    // max
    @Override public Float visitMAX(GrammarParser.MAXContext ctx) {
        Float max = 0f;
        Float val1 = Float.valueOf(ctx.NUMBER(0).getText());
        Float val2 = Float.valueOf(ctx.NUMBER(1).getText());
        if (val1 < val2) {
            max = val2;
        } else {
            max = val1;
        }
        return max;
    }

    @Override public Float visitINV(GrammarParser.INVContext ctx) {
        Float val = visit(ctx.expression());
        return -val;
    }

    // zavorky
    @Override public Float visitParents(GrammarParser.ParentsContext ctx) {
        return visit(ctx.expression());
    }

    // faktorial
    @Override public Float visitFACT(GrammarParser.FACTContext ctx) {
        Float result = 1f;
        Float val = visit(ctx.expression());

        Integer intValue = val.intValue();
        if ((val - intValue) != 0) {
            System.err.println("Číslo ve faktoriálu musí být celé číslo!");
            //System.exit(0);
        } else {
            for (int i = 2; i <= val; i++) {
                result *= i;
            }
        }
        return result;
    }

}
