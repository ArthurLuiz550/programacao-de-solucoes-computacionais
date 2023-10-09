package pratica6Quest3;

import java.util.Scanner;

public class Pratica6Quest3 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Declarar um vetor para armazenar os números
                double[] numeros = new double[10];

                // Ler os números e armazená-los no vetor
                for (int i = 0; i < 10; i++) {
                    System.out.print("Digite o " + (i + 1) + "º número real: ");
                    numeros[i] = scanner.nextDouble();
                }

                // Inicializar as variáveis para o menor e o maior número
                double menor = numeros[0];
                double maior = numeros[0];

                // Encontrar o menor e o maior número no vetor
                for (int i = 1; i < 10; i++) {
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                    }
                    if (numeros[i] > maior) {
                        maior = numeros[i];
                    }
                }

                // Imprimir o vetor, o menor e o maior número
                System.out.println("Números informados:");
                for (int i = 0; i < 10; i++) {
                    System.out.println(numeros[i]);
                }

                System.out.println("Menor número: " + menor);
                System.out.println("Maior número: " + maior);

                scanner.close();
            }
        }
