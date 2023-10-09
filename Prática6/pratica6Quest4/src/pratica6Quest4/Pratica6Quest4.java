package pratica6Quest4;

import java.util.Scanner;

public class Pratica6Quest4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Declarar um vetor para armazenar os números
            double[] numeros = new double[10];

            // Ler os números e armazená-los no vetor
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "º número real: ");
                numeros[i] = scanner.nextDouble();
            }

            // Imprimir os elementos nas posições pares do vetor
            System.out.println("Elementos nas posições pares do vetor:");
            for (int i = 0; i < 10; i += 2) {
                System.out.println(numeros[i]);
            }

            scanner.close();
        }
    }


