import org.stringtemplate.v4.*;
import java.util.*;
import org.antlr.v4.*;
import org.antlr.v4.runtime.ParserRuleContext;

@SuppressWarnings("CheckReturnValue")
public class Compiler extends TablanBaseVisitor<ST> {

   String tableType = null;
   String tableName = null;

   @Override
   public ST visitProgram(TablanParser.ProgramContext ctx) {
      ST res = st.getInstanceOf("program");
      List<ST> defineTables = new ArrayList<>();
      List<ST> instructions = new ArrayList<>();

      for (TablanParser.InstructionContext instructionContext : ctx.instruction()) { //visitar todas as instructions
         ST instruction = visit(instructionContext);
         if (instructionContext.define_table() != null) {//difernete tratamento se a instruction for define_table pois temos de criar novo tipo
            defineTables.add(instruction);
         } else {
            instructions.add(instruction);
         }
      }

      res.add("define_table", defineTables);
      res.add("instruction", instructions);

      return res;
   }

   @Override
   public ST visitInstruction(TablanParser.InstructionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
   }

   @Override
   public ST visitDefine_table(TablanParser.Define_tableContext ctx) {
      ST res = st.getInstanceOf("define_table");

      res.add("table_type", ctx.table_type().ID().getText());
      if(ctx.table_type().table_name()!=null){
         res.add("tableName", ctx.table_type().table_name().element_name().STRING());
      }
      tableType = ctx.table_type().ID().getText();
      for (int i = 0; i < ctx.ID().size(); i++) {
         res.add("var", ctx.ID(i).getText());

         // nome de variaveis diferentes
         String coluns = newVar();
         res.add("varName", coluns);

         res.add("element_type", ctx.element_type(i).getText());
         if (!(ctx.element_name(i) == null)) {
            res.add("element_name", ctx.element_name(i).STRING());
         }
      }
      return res;
   }


   @Override
   public ST visitTable_type(TablanParser.Table_typeContext ctx) {
      ST res = st.getInstanceOf("table_type");
      
      res.add("ID", ctx.ID().getText());
      res.add("table_name", visit(ctx.table_name()));
      return res;
   }

   @Override
   public ST visitTable_name(TablanParser.Table_nameContext ctx) {
      ST res = st.getInstanceOf("table_name");
      res.add("element_name", ctx.element_name().STRING());
      return res;
   }

   @Override
   public ST visitColumn_name(TablanParser.Column_nameContext ctx) {
      ST res = null;
      return visitChildren(ctx);
   }

   @Override
   public ST visitElement_name(TablanParser.Element_nameContext ctx) {
      ST res = st.getInstanceOf("element_name");
      res.add("type", ctx.getText().replaceAll("\"", ""));
      return res;
   }

   @Override
   public ST visitDeclare_variable(TablanParser.Declare_variableContext ctx) {
      ST res = st.getInstanceOf("declare_variable");

      if (!ctx.ID().isEmpty()) {
         String firstId = ctx.ID().get(0).getText();
         res.add("ID", firstId);

         if (!(ctx.element_type() == null)) {
            res.add("element_type", visit(ctx.element_type()).render());
         } else {
            String secondId = ctx.ID().get(1).getText();
            res.add("element_type", secondId);
         }
      }

      res.render();
      return res;
   }

   @Override
   public ST visitElement_type(TablanParser.Element_typeContext ctx) {
      ST res = st.getInstanceOf("element_type");
      String type = ctx.getText();
      res.add("type", ctx.getText());
      return res;
   }

   @Override
   public ST visitAssignment(TablanParser.AssignmentContext ctx) {

      ST res = st.getInstanceOf("assignment");

      if (ctx.ID() != null) {
         String firstId = ctx.ID().getText();
         res.add("ID", firstId);
      }
      // For expression assignment
      if (ctx.expr() != null) {
         ST expr = visit(ctx.expr());

            if(ctx.expr() instanceof TablanParser.ExprVectorContext){
               // System.out.println("vectorrrr : " + expr.render());
               res.add("vector", expr.render());
            }
            else {
               res.add("expr", expr.render());
            }
      }

      // For column assignment
      if (ctx.column() != null) {
         ST column = visit(ctx.column());
         res.add("column", column);
      }

      // // For element name assignment
      if (ctx.element_name() != null) {
         ST elementName = visit(ctx.element_name());
         res.add("element_name", elementName);
      }

      // // For table type assignment
      if (ctx.table_type() != null) {
         ST tableType = visit(ctx.table_type());
         res.add("table_type", tableType);
      }
      
      return res;
   }

   @Override
   public ST visitLoop(TablanParser.LoopContext ctx) {
      ST res = null;
      return visitChildren(ctx);
   }

   // funcionaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
   @Override
   public ST visitPrint(TablanParser.PrintContext ctx) {
      ST res = st.getInstanceOf("print");

      for (TablanParser.Print_exprContext printExprCtx : ctx.print_expr()) {
         ST expr = visit(printExprCtx);
         res.add("print_expr", expr.render());
      }
      return res;
   }

   @Override
   public ST visitPrint_expr(TablanParser.Print_exprContext ctx) {
      ST res = st.getInstanceOf("print_expr");
      Iterator<TablanParser.ExprContext> print_list = ctx.expr().iterator();

      while (print_list.hasNext()) {
         res.add("expr", visit(print_list.next()).render());
      }
      return res;
   }

   @Override public ST visitExprVector(TablanParser.ExprVectorContext ctx) {
      ST res = null;
      return visitChildren(ctx);
   }

   @Override public ST visitExpreCoverser(TablanParser.ExpreCoverserContext ctx) {
      ST res = null;
      return visitChildren(ctx);
   }

   @Override
   public ST visitExprRead(TablanParser.ExprReadContext ctx) {
      ST res = st.getInstanceOf("read");

      for (int i = 0; i < ctx.expr().size(); i++) {
         ST expr = visit(ctx.expr(i));
         // res.add("expr", ctx.expr.getText());
      }

      // Get the filename string using the getText() method
      String filename = ctx.getText().replaceAll("\"", "");
      res.add("filename", filename);

      return res;
   }
      
   @Override public ST visitExprMulDiv(TablanParser.ExprMulDivContext ctx) {
      ST res = st.getInstanceOf("MulDiv");

      res.add("ID1", ctx.expr(0).getText());
      res.add("ID2", ctx.expr(1).getText());
      return res;
   }

   @Override public ST visitExprParent(TablanParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public ST visitExprColumn(TablanParser.ExprColumnContext ctx) {
      ST res = null;
      return visitChildren(ctx);
   }

   @Override
   public ST visitExprLiteral(TablanParser.ExprLiteralContext ctx) {
      ST res = st.getInstanceOf("literal");
      res.add("n", ctx.getText());
      return res;
   }

   @Override public ST visitExprSubSum(TablanParser.ExprSubSumContext ctx) {
      ST res = st.getInstanceOf("SubSum");

      res.add("ID1", ctx.expr(0).getText());
      res.add("ID2", ctx.expr(1).getText());
      return res;
   }

   @Override public ST visitExprUsing(TablanParser.ExprUsingContext ctx) {
      ST res = st.getInstanceOf("using");
      for (TablanParser.SelectionContext selectionContext : ctx.selection()) {
         ST selection = visit(selectionContext);
         res.add("selection", selection);
      }
      return res;
   }
 
   @Override
   public ST visitExprNewTable(TablanParser.ExprNewTableContext ctx) {

      ST res = st.getInstanceOf("new_table");

      res.add("table_type", tableType);
      for (int i = 0; i< ctx.column().size(); i++) {
         // System.out.println(ctx.column(i).ID(0));
         res.add("ID1", ctx.column(i).ID(0));
         // System.out.println(ctx.column(i).ID(0));

         res.add("ID2", ctx.column(i).ID(1));
      }

      return res;
   }

   @Override
   public ST visitExprVariable(TablanParser.ExprVariableContext ctx) {
      ST res = st.getInstanceOf("var_name");
      res.add("name", ctx.ID().getText());
      return res;
   }

   @Override public ST visitExprLenght(TablanParser.ExprLenghtContext ctx) {
      ST res = null;
      return visitChildren(ctx);
   }

   @Override public ST visitSelection(TablanParser.SelectionContext ctx) {
      ST res = st.getInstanceOf("selection");
      res.add("expr", visit(ctx.expr()));
      res.add("ID", ctx.ID().getText());
      return res;
   }

   @Override
   public ST visitColumn(TablanParser.ColumnContext ctx) {
      ST res = st.getInstanceOf("column");
      // System.out.println("entrei");
      // System.out.println(ctx.ID(0));
      // System.out.println(ctx.ID(1));
      res.add("ID", ctx.ID(0));
      res.add("ID2", ctx.ID(1));
      return res;
   }

   @Override public ST visitLiteral(TablanParser.LiteralContext ctx) {
      ST res = st.getInstanceOf("literal");
      res.add("n", ctx.STRING().getText());
      return res;
   }

   @Override public ST visitVector(TablanParser.VectorContext ctx) {
      ST res = st.getInstanceOf("vector");

      if(ctx.expr(0) == null && ctx.expr(1) == null){
         res.add("expr1", "null");
         res.add("expr2", "null");

      } else{
        res.add("expr1",ctx.expr(0).getText()); 
        res.add("expr2",ctx.expr(1).getText()); 
      }
      
      res.add("ID", ctx.ID());

      res.render();      
      return res;
   }

   private int numVars = 1;
   private STGroup st = new STGroupFile("template.stg");

   private String newVar(){
      String s =  "col"+numVars;
      numVars++;
      return s;
   }
}