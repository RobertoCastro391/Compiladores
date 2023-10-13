@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<Object> {

   @Override public Object visitGreetings(HelloParser.GreetingsContext ctx) {
      Object res = null;
      System.out.printf("Ola' %s\n", visitName(ctx.name()));
     
      return res;
   }
   @Override public Object visitBye(HelloParser.ByeContext ctx) {
      Object res = null;
      System.out.printf("Adeus' %s\n", visitName(ctx.name()));
     
      return res;
   }
   @Override public Object visitName(HelloParser.NameContext ctx) {
      String res = "";

      for (TerminalNode id: ctx.ID()) {
         res += id.getText() + " ";
      }

      
     
      return res;
   }
}

