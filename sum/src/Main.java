import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;

        System.out.println("Provide a number for its sum:");
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++){
            System.out.printf("\n%s+%s = %s", sum, i, sum += i);
        }

        int average = sum / number;

        System.out.printf("\nThe average is: %s", average);
    }
}
