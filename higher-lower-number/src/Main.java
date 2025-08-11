import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++){
            System.out.printf("Provide the number %s: ", i);
            int number = scanner.nextInt();

            numbers.add(number);
        }

        int max = numbers.getFirst();
        int min = numbers.getFirst();

        for (int i = 0; i < numbers.size(); i++){
            max = Math.max(max, numbers.get(i));
            min = Math.min(min, numbers.get(i));

            sum += numbers.get(i);
        }

        float average = (float) sum / numbers.size();

        System.out.printf("\nThe maximum value is: %s", max);
        System.out.printf("\nThe minimum value is: %s", min);
        System.out.printf("\nThe sum is: %s", sum);
        System.out.printf("\nThe average is: %s", average);
    }
}
