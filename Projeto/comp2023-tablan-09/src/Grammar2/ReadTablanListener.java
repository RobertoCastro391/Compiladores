// Generated from ReadTablan.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReadTablanParser}.
 */
public interface ReadTablanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReadTablanParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ReadTablanParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadTablanParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ReadTablanParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadTablanParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ReadTablanParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadTablanParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ReadTablanParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadTablanParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(ReadTablanParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadTablanParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(ReadTablanParser.FieldContext ctx);
}