import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
import org.antlr.v4.*;


public class TablanMain {
   public static void main(String[] args) {
      try{
         
         if (args.length != 1){
            System.exit(1);
         }
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName(args[0]);
         // create a lexer that feeds off of input CharStream:
         TablanLexer lexer = new TablanLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         TablanParser parser = new TablanParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            Compiler compiler = new Compiler();
            ST result = compiler.visit(tree);
            result.add("name", "Output");
            System.out.println(result.render());
         }
      }
      catch(Exception e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}      