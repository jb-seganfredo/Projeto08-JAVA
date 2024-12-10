package Atividade07;

import java.util.Scanner;

public class LettersCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase para contarmos as palavras: ");
        String phrase = scanner.nextLine().trim();

        if (phrase.isEmpty()) {
            System.out.println("A frase está vazia.");
        } else {
            int wordCount = 0;
            boolean isWord = false;

            for (int i = 0; i < phrase.length(); i++) {
                char currentChar = phrase.charAt(i);

                if (currentChar != ' ') {
                    if (!isWord) {
                        wordCount++;
                        isWord = true;
                    }
                } else {
                    isWord = false;
                }
            }

            System.out.println("A frase contém " + wordCount + " palavra(s).");
        }

        scanner.close();
    }
}
