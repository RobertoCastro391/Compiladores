// Generated from Tablan.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TablanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TablanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TablanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TablanParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(TablanParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#define_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_table(TablanParser.Define_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#table_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type(TablanParser.Table_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(TablanParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(TablanParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#element_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_name(TablanParser.Element_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#declare_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_variable(TablanParser.Declare_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#element_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_type(TablanParser.Element_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TablanParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(TablanParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TablanParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expr(TablanParser.Print_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVector}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVector(TablanParser.ExprVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpreCoverser}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreCoverser(TablanParser.ExpreCoverserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(TablanParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(TablanParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(TablanParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprColumn}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprColumn(TablanParser.ExprColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLiteral(TablanParser.ExprLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubSum}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubSum(TablanParser.ExprSubSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUsing}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUsing(TablanParser.ExprUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNewTable}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNewTable(TablanParser.ExprNewTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(TablanParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLenght}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLenght(TablanParser.ExprLenghtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(TablanParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(TablanParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TablanParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TablanParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(TablanParser.VectorContext ctx);
}