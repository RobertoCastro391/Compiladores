package Files;

public class TypeInteger extends Type{

    public TypeInteger() {
        super("integer");
    }
    
    public boolean isNumeric(){
        return true;
    }

    @Override public boolean compareType(Type other) {
        return super.compareType(other) || other.type().equals("real");
     }
}
