import java.util.Scanner;
import java.util.Stack;


public class Ex1_3 {

    public static void calculator() {
        Scanner input = new Scanner(System.in);
        Stack<Double> stack = new Stack<Double>();
        
        try {
            while(input.hasNext()) {
                if (input.hasNextDouble()) {
                    stack.push(input.nextDouble());
                }
                else {
                    
                    String token = input.next();
                    Double a, b, result;

                    if (token.length() != 1) {
                        System.err.printf("%s is not a valid token\n", token);
                        continue;
                    }

                    switch(token) {
                    case "+":
                        b = stack.pop();
                        a = stack.pop();
                        result = a + b;
                        break;
                    
                    case "-":
                        b = stack.pop();
                        a = stack.pop();
                        result = a - b;
                        break;
                    case "*":
                        b = stack.pop();
                        a = stack.pop();
                        result = a * b;
                        break;
                    
                    case "/":
                        b = stack.pop();
                        a = stack.pop();
                        result = a / b;
                        break;
                    default:
                        System.err.printf("%s is not a valid token\n", token);
                        continue;
                    }

                    stack.push(result);
                }
                System.out.printf("Stack: %s\n", stack.toString());
            }
            input.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Empty Stack");
            return;
        }
            
    }

    public static void main(String[] args) {
        calculator();
    }
}