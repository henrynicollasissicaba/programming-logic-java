import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;

        System.out.println("Provide a number for its factorial:");
        int number = scanner.nextInt();

        if(number == 1 || number == 0){
            System.out.println("The factorial of 0 or 1 is 1.");
            return;
        }

        for (int i = 1; i <= number; i++){
            result = result * i;
        }

        System.out.printf("The factorial of %s is: %s", number, result);
    }
}
