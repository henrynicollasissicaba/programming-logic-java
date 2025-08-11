import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> reversedNames = new ArrayList<>();

        for (int i = 1; i <= 5; i++){
            System.out.printf("Provide the name %s: ", i);
            String name = scanner.next();

            names.add(name);
        }

        for (String name : names){
            String reversedName = new StringBuilder(name).reverse().toString();
            reversedNames.add(reversedName);
        }

        System.out.println(reversedNames);
    }
}
