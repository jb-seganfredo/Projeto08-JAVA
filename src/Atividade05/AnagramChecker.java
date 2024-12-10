package Atividade05;
import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra escolhida: ");
        String word1 = scanner.nextLine().toLowerCase();

        System.out.println("Digite a segunda palavra escolhida: ");
        String word2 = scanner.nextLine().toLowerCase();

        if (word1.length() != word2.length()) {
            System.out.println("As palavras não são anagramas.");
        } else {
            char[] word1Array = word1.toCharArray();
            char[] word2Array = word2.toCharArray();
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            if (Arrays.equals(word1Array, word2Array)) {
                System.out.println("As palavras são anagramas.");
            } else {
                System.out.println("As palavras não são anagramas.");
            }
        }
        scanner.close();
    }
}
