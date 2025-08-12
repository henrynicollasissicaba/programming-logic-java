import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> foundVowels = new ArrayList<>();
        int totalVowels = 0;

        System.out.println("Enter a word:");
        String word = scanner.next();

        for (char c : word.toCharArray()){
            if(isVowel(c)){
                totalVowels++;
                foundVowels.add(c);
            }
        }

        System.out.printf("\nWord: %s.", word);
        System.out.printf("\nFounded %s vowel(s).", totalVowels);

        for (char c : foundVowels){
            System.out.printf("\nVowel: %s", c);
        }
    }

    private static final Set<Character> VOWELS = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    );

    private static boolean isVowel(char c){
        return VOWELS.contains(c);
    }
}
