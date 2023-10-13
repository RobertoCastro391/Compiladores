// Generated from Tablan.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TablanParser}.
 */
public interface TablanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TablanParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TablanParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TablanParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(TablanParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(TablanParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#define_table}.
	 * @param ctx the parse tree
	 */
	void enterDefine_table(TablanParser.Define_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#define_table}.
	 * @param ctx the parse tree
	 */
	void exitDefine_table(TablanParser.Define_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#table_type}.
	 * @param ctx the parse tree
	 */
	void enterTable_type(TablanParser.Table_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#table_type}.
	 * @param ctx the parse tree
	 */
	void exitTable_type(TablanParser.Table_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(TablanParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(TablanParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(TablanParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(TablanParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#element_name}.
	 * @param ctx the parse tree
	 */
	void enterElement_name(TablanParser.Element_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#element_name}.
	 * @param ctx the parse tree
	 */
	void exitElement_name(TablanParser.Element_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_variable(TablanParser.Declare_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_variable(TablanParser.Declare_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#element_type}.
	 * @param ctx the parse tree
	 */
	void enterElement_type(TablanParser.Element_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#element_type}.
	 * @param ctx the parse tree
	 */
	void exitElement_type(TablanParser.Element_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TablanParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TablanParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(TablanParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(TablanParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TablanParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TablanParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expr(TablanParser.Print_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expr(TablanParser.Print_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVector}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVector(TablanParser.ExprVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVector}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVector(TablanParser.ExprVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpreCoverser}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpreCoverser(TablanParser.ExpreCoverserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpreCoverser}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpreCoverser(TablanParser.ExpreCoverserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(TablanParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(TablanParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(TablanParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(TablanParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(TablanParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(TablanParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprColumn}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprColumn(TablanParser.ExprColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprColumn}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprColumn(TablanParser.ExprColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLiteral(TablanParser.ExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLiteral(TablanParser.ExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubSum}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubSum(TablanParser.ExprSubSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubSum}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubSum(TablanParser.ExprSubSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUsing}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUsing(TablanParser.ExprUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUsing}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUsing(TablanParser.ExprUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNewTable}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNewTable(TablanParser.ExprNewTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNewTable}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNewTable(TablanParser.ExprNewTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(TablanParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(TablanParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLenght}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLenght(TablanParser.ExprLenghtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLenght}
	 * labeled alternative in {@link TablanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLenght(TablanParser.ExprLenghtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(TablanParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(TablanParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(TablanParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(TablanParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TablanParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TablanParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TablanParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(TablanParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TablanParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(TablanParser.VectorContext ctx);
}