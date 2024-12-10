package Atividade04;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número a ser invertido: ");
        String number = scanner.nextLine();

        boolean isNegative = number.startsWith("-");
        if (isNegative) {
            number = number.substring(1);
        }

        String reversed = new StringBuilder(number).reverse().toString();

        if (isNegative) {
            reversed = "-" + reversed;
        }

        System.out.println("O numero invertido é: " + reversed);

        scanner.close();
    }
}
