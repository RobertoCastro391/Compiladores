import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import Grammar2.TableGeral;

public class ReadMain{

   public static TableGeral Importfile(String filename, TableGeral existingTable) {
      TableGeral table = (existingTable != null) ? existingTable : new TableGeral();
      try {
         File file = new File(filename);
         FileInputStream fl = new FileInputStream(file);
         CharStream input = CharStreams.fromStream(fl);
         ReadTablanLexer lexer = new ReadTablanLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         ReadTablanParser parser = new ReadTablanParser(tokens);
         ParseTree tree = parser.file();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            ReadFile readFile = new ReadFile(table);
            table = readFile.visit(tree);
         }
      } catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      } catch (RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
      return table;
   }

   // public static void main(String[] args){
      

   //    String filename = "../../examples/list1.csv";
   //    Table tabela = Importfile(filename,null);
   //    tabela.setName_table("SARA FEIA:");
   //    tabela.printLineByLine(tabela);
   // }
}