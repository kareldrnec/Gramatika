package output;

import java.util.Random;

public class EvalVisitor extends GrammarBaseVisitor<Double>{
    @Override public Double visitProgram(GrammarParser.ProgramContext ctx) { return visitChildren(ctx); }

    @Override public Double visitPrint(GrammarParser.PrintContext ctx) {
        Double value = visit(ctx.expression());
        Integer intValue = value.intValue();
        if ((value - intValue) == 0) {
            System.out.println(intValue);
        } else {
            System.out.println(value);
        }
        return value;
    }

    @Override public Double visitPOW(GrammarParser.POWContext ctx) {
        Double left = visit(ctx.expression(0));
        Double right = visit(ctx.expression(1));
        return (Double) Math.pow(left, right);
    }


    @Override public Double visitADD(GrammarParser.ADDContext ctx) {
        Double left = visit(ctx.expression(0));
        Double right = visit(ctx.expression(1));
        return left + right;
    }

    @Override public Double visitMINUS(GrammarParser.MINUSContext ctx) {
        Double left = visit(ctx.expression(0));
        Double right = visit(ctx.expression(1));
        return left - right;
    }

    @Override public Double visitMUL(GrammarParser.MULContext ctx) {
        Double left = visit(ctx.expression(0));
        Double right = visit(ctx.expression(1));
        return left * right;
    }

    @Override public Double visitMOD(GrammarParser.MODContext ctx) {
        Double left = visit(ctx.expression(0));
        Double right = visit(ctx.expression(1));
        return left % right;
    }


    @Override public Double visitDIV(GrammarParser.DIVContext ctx) {
        Double left = visit(ctx.expression(0));
        Double right = visit(ctx.expression(1));
        if (right == 0) {
            throw new IllegalArgumentException("IllegalArgumentException: Nelze delit cislem 0!");
        }
        return left / right;
    }

    @Override public Double visitNUMBER(GrammarParser.NUMBERContext ctx) {
        return Double.valueOf(ctx.NUMBER().getText());
    }

    @Override public Double visitRAND(GrammarParser.RANDContext ctx) {
        Double result = null;
        Double min = Double.valueOf(ctx.NUMBER(0).getText());
        Double max = Double.valueOf(ctx.NUMBER(1).getText());
        if (min == max) {
            result = min;
        } else if (min > max) {
            System.err.println("Maximální hodnota musí být větší než hodnota minimální!");
        } else {
            Random r = new Random();
            result = min + r.nextFloat() * (max - min);
        }
        return result;
    }

    @Override public Double visitMIN(GrammarParser.MINContext ctx) {
        Double min = null;
        Double val1 = Double.valueOf(ctx.NUMBER(0).getText());
        Double val2 = Double.valueOf(ctx.NUMBER(1).getText());
        if (val1 > val2) {
            min = val2;
        } else {
            min = val1;
        }
        return min;
    }

    @Override public Double visitMAX(GrammarParser.MAXContext ctx) {
        Double max = null;
        Double val1 = Double.valueOf(ctx.NUMBER(0).getText());
        Double val2 = Double.valueOf(ctx.NUMBER(1).getText());
        if (val1 < val2) {
            max = val2;
        } else {
            max = val1;
        }
        return max;
    }

    @Override public Double visitINV(GrammarParser.INVContext ctx) {
        Double val = visit(ctx.expression());
        return -val;
    }

    @Override public Double visitParents(GrammarParser.ParentsContext ctx) {
        return visit(ctx.expression());
    }

    @Override public Double visitFACT(GrammarParser.FACTContext ctx) {
        Double result = 1.0;
        Double val = visit(ctx.expression());
        Integer intValue = val.intValue();
        if ((val - intValue) != 0) {
            throw new IllegalArgumentException("Číslo ve faktoriálu musí být celé kladné číslo!");
        } else if (val > 12) {
            throw new IllegalArgumentException("Moc velké číslo pro výpočet faktoriálu! Maximální hodnota pro výpočet faktoriálu je 12 (12.0)!");
        } else {
            for (int i = 2; i <= val; i++) {
                result *= i;
            }
        }
        return result;
    }

}
