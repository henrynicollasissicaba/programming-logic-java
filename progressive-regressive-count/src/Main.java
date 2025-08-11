import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a number:");
        int number = scanner.nextInt();

        System.out.println("====== Regressive ======");
        for (int i = number; i >= 0; i--){
            System.out.println(i);
        }

        System.out.println("====== Progressive ======");
        for (int i = 0; i <= number; i++){
            System.out.println(i);
        }
    }
}
