// Generated from ReadTablan.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReadTablanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReadTablanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReadTablanParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ReadTablanParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadTablanParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ReadTablanParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadTablanParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ReadTablanParser.FieldContext ctx);
}