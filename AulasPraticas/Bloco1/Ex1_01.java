import java.util.Scanner;

public class Ex1_01 {
    static Scanner input;
   
    public static String readToken() {
        
        String token = null;
        
        try {
            token = input.next();
        }
        catch(Exception e) {
            System.exit(0);

        }
        return token;
    }


    public static Double readOperand() {
        String token;
        Double value;
        
        for(;;) {
            token = readToken();
            try{
                value = Double.valueOf(token);
            }
            catch(Exception e) {
                System.err.printf("%s is not a valid real number\n", token);
                continue;
            }
            return value;
        }
    }

    public static String ReadOperation() {
        String token;
        
        for(;;) {
            token = readToken();
            
            if (token.length() == 1 && (token.charAt(0) == '+' || token.charAt(0) == '-' ||
            token.charAt(0) == '/' || token.charAt(0) == '*')) {
                return token;
            }

            System.err.printf("%s is not a valid operation\n", token);
        }
    }

    public static void calculator() {
        Double operand1, operand2, result;
        String operation;

        for(;;) {
            operand1 = readOperand();
            operation = ReadOperation();
            operand2 = readOperand();
            result = 0.0;

            switch(operation){
                case "+":
                    result = operand1+operand2;
                    break;
    
                case "-":
                    result = operand1-operand2;
                    break;
    
                case "*":
                    result = operand1*operand2;
                    break;
                
                case "/":
                    result = operand1/operand2;
                    break;
            }
            
            System.out.printf("%f\n", result);
        }
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        calculator();
    }
}