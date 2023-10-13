import java.util.*;
import org.antlr.v4.*;
import org.antlr.v4.runtime.ParserRuleContext;
import Grammar2.TableGeral;


public class ReadFile extends ReadTablanBaseVisitor<TableGeral> {
   private TableGeral table;

   public ReadFile(TableGeral table) {
      this.table = table;
   }

   @Override
   public TableGeral visitFile(ReadTablanParser.FileContext ctx) {
      for (ReadTablanParser.LineContext sc : ctx.line()) {
         visit(sc);
      }

      return table;
   }

   @Override
   public TableGeral visitLine(ReadTablanParser.LineContext ctx) {

      if (table.getHeadername().isEmpty()) {
         // Adicionar colunas com base nos nomes fornecidos pelo header
         for (int i = 0; i < ctx.field().size(); i++) {
            table.addColumn(ctx.field(i).getText(), "String");
         }
      }else{     

         ArrayList<String> headertable = table.getHeadername();

         for (int i = 0; i < ctx.field().size(); i++) {
            String type = table.getColumnType(headertable.get(i));

            switch(type){
               case "String":
                  table.addLine(headertable.get(i), ctx.field(i).getText().trim());
                  break;
                  
               case "int":
                  table.addLine(headertable.get(i), Integer.parseInt(ctx.field(i).getText().trim()));
                  break;
                   
               case "double":
                  table.addLine(headertable.get(i), Double.parseDouble(ctx.field(i).getText().trim()));
                  break;
                   
               default:
                   //ErrorHandling.printError("Invalid type!");
                   break;
           } 
            
         }
      }
      return table;
   }

}