import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        System.out.println("Provide a number and discover if it's EVEN or ODD:");
        int number = scanner.nextInt();

        if(isEven(number) && isPositive(number)){
            answer = "The number is EVEN and it's POSITIVE.";

        } else if(isEven(number) && !isPositive(number)){
            answer = "The number is EVEN and it's NEGATIVE or EQUALS TO zero.";

        } else if(!isEven(number) && isPositive(number)){
            answer = "The number is ODD and it's POSITIVE.";

        } else if(!isEven(number) && !isPositive(number)){
            answer = "The number is ODD and NEGATIVE.";

        }

        System.out.println(answer);
    }

    private static boolean isEven(int number){
        return number % 2 == 0;
    }

    private static boolean isPositive(int number){
        return number > 0;
    }
}
