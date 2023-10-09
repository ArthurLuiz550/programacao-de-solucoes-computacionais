package pratica6Quest2;

import java.util.Scanner;

public class Pratica6Quest2 {


        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double[] vetor = new double[10];

                for (int i = 0; i < 10; i++) {
                        System.out.print("Digite um número real: ");
                        vetor[i] = scanner.nextDouble();
                }

                System.out.println("Vetor de números reais:");

                for (int i = 0; i < 10; i++) {
                        System.out.print(vetor[i] + " ");
                }

                System.out.println();

                System.out.println("Posições com números negativos:");

                for (int i = 0; i < 10; i++) {
                        if (vetor[i] < 0) {
                                System.out.println("Posição " + i + ": " + vetor[i]);
                        }


                        scanner.close();
                }
        }
}









