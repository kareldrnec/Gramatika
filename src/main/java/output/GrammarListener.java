// Generated from C:/Users/Karlos/IdeaProjects/Gramatika/src/main/java\Grammar.g4 by ANTLR 4.9.2
package output;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADD(GrammarParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADD(GrammarParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER(GrammarParser.NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER(GrammarParser.NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RAND}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRAND(GrammarParser.RANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RAND}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRAND(GrammarParser.RANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMOD(GrammarParser.MODContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMOD(GrammarParser.MODContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MAX}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMAX(GrammarParser.MAXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MAX}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMAX(GrammarParser.MAXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMUL(GrammarParser.MULContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMUL(GrammarParser.MULContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParents(GrammarParser.ParentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParents(GrammarParser.ParentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FACT}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFACT(GrammarParser.FACTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FACT}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFACT(GrammarParser.FACTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMINUS(GrammarParser.MINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMINUS(GrammarParser.MINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INV}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterINV(GrammarParser.INVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INV}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitINV(GrammarParser.INVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDIV(GrammarParser.DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDIV(GrammarParser.DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MIN}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMIN(GrammarParser.MINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MIN}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMIN(GrammarParser.MINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code POW}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPOW(GrammarParser.POWContext ctx);
	/**
	 * Exit a parse tree produced by the {@code POW}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPOW(GrammarParser.POWContext ctx);
}