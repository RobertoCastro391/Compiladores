import java.util.Scanner;
import java.util.HashMap;
import java.io.FileInputStream;

public class Ex1_4 {

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

        while(input.hasNext()) {
            String token = input.next();
            Integer value;
            value = dictionary.get(token);
            
            if (value != null) {
                System.out.printf("%d ", value);
            }
            else {
                System.out.printf("%s ", token);
            }
        }
        System.out.printf("\n");
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