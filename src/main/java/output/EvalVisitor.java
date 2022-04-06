package output;

public class EvalVisitor extends GrammarBaseVisitor<Float>{
    @Override public Float visitProgram(GrammarParser.ProgramContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Float visitPrint(GrammarParser.PrintContext ctx) {
        return 0f;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

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
            System.exit(0);
        }
        return left / right;
    }

    @Override public Float visitNUMBER(GrammarParser.NUMBERContext ctx) {
        return Float.valueOf(ctx.NUMBER().getText());
    }

    @Override public Float visitRAND(GrammarParser.RANDContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Float visitParents(GrammarParser.ParentsContext ctx) {
        return visit(ctx.expression());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Float visitPOW(GrammarParser.POWContext ctx) {
        return 1.2f;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Float visitFACT(GrammarParser.FACTContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

}
