package Files;
public abstract class Type
{
   protected Type(String type) {
      assert type != null;
      this.type = type;
   }

   public String type() {
      return type;
   }

   public boolean compareType(Type other) {
      return type.equals(other.type());
   }

   public boolean isNumeric() {
      return false;
   }

   @Override
   public String toString() {
      return type;
   }

   protected final String type;
}
