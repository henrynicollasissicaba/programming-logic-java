import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder reversedWord = new StringBuilder();

        System.out.println("Provide a word:");
        String word = scanner.next();

        String[] splitWord = word.split("");

        for (int i = splitWord.length - 1; i >= 0; i--){
            reversedWord.append(splitWord[i]);
        }

        if(word.contentEquals(reversedWord.toString())){
            System.out.printf("The word '%s' is a Palindrome.", word);
        } else {
            System.out.printf("The word '%s' isn't a Palindrome. Word: '%s' || Reversed Word: '%s'",
                    word, word, reversedWord);
        }
    }
}
