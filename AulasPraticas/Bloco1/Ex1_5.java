import java.util.Scanner;
import java.util.HashMap;
import java.io.FileInputStream;

public class Ex1_5 {

    public static HashMap<String, Integer> loadfile(String filename) {
        
        FileInputStream fileInput = null;
        Scanner input;
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        try{
            fileInput = new FileInputStream(filename);
        }
        catch (Exception e) {
            System.err.printf("Cannot use file \"%s\": %s\n", filename, e);
            System.exit(2);
        }

        input = new Scanner(fileInput);

        try {
            while(input.hasNext()) {
                Integer value;
                String name;

                value = input.nextInt();
                input.next();
                name = input.next();
                dictionary.put(name, value);
            }
        } catch (Exception e) {
            System.err.printf("Cannot use file \"%s\": wrong format\n", filename);
            System.exit(3);
        }
        input.close();

        return dictionary;
    }

    public static void parseInput(HashMap<String, Integer> dictionary) {
        Scanner input = new Scanner(System.in);
        Integer value, sum = 0, acc =0;
        
        while(input.hasNext()) {
            String token = input.next();
            Character lastValue = 's';
            value = dictionary.get(token);
            
            if (value != null) {
                if (value == 100 || value == 1000 || value == 1000000 ) {
                    acc *= value;
                    lastValue = 'm';
                }
            
                else {
                    if (lastValue == 'm') {
                        sum += acc;
                        acc = 0;
                    }
                    acc += value;
                    lastValue = 's';
                }
            }
            else {
                //System.out.printf("%s ", token);
            }
        }
        sum += acc;

        System.out.printf("%d\n", sum);
        input.close();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: Exercício filename");
            System.exit(1);
        }
        parseInput(loadfile(args[0]));
    }
}