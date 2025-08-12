import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            System.out.printf("Provide a number %s: ", i);
            int number = scanner.nextInt();

            numbers.add(number);
        }

        ArrayList<Integer> nonRepeatedNumbers = new ArrayList<>(new LinkedHashSet<>(numbers));

        System.out.println(nonRepeatedNumbers);
    }
}
