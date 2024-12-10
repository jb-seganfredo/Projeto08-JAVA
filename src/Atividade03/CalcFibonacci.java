package Atividade03;
import java.util.Scanner;

public class CalcFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Digite um número maior que zero");
        } else {
            System.out.println("O primeiros " + n + " números da sequência de Fibonacci são: ");
        }

        long first = 0, second = 1;

        for(int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
    }
}
