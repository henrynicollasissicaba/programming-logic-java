import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a number for its multiplication table:");
        int number = scanner.nextInt();

        System.out.println("==== Providing multiplication table range ====");

        System.out.println("Provide the initial number:");
        int initialNumber = scanner.nextInt();

        System.out.println("Provide the final number:");
        int finalNumber = scanner.nextInt();

        for (int i = initialNumber; i <= finalNumber; i++){
            System.out.printf("\n%sx%s = %s", number, i, i * number);
        }
    }
}
