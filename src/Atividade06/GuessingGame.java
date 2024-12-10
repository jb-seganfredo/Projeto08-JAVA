package Atividade06;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(50) + 1;
        int userGuess = 0;
        int attempts = 0;

        while (userGuess != numberToGuess) {
            System.out.println("Bem-vindo ao jogo dos números. Digite um número entre 1 e 50");
            userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 50) {
                System.out.println("Por favor, digite um número válido entre 1 e 50.");
                continue;
            }

            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Parabéns! Você adivinhou o número em " + attempts + " tentativas.");
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }
    }
}
