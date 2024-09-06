//JUDAH BENJAMIN - 22/08/2024

// 5 - Faça um programa que gere uma matriz de 3 x 3, que receba números aleatórios,
// organize esta matriz do maior para o menor e mostre:
// a) A matriz digitada originalmente;
// b) A matriz organizada do menor para o maior;
// c) O maior valor da matriz;
// d) A média dos números digitados na matriz.

package revisão_algoritmos;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class questao_5 {
    public static int[][] criar_matriz() {
        Random random = new Random();
        int[][] matriz = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = random.nextInt(10);
            }
        }
        return matriz;
    }

    public static int[][] organizar(int[][] matriz) {
        int[] temporario = new int[9];
        int cont_temp = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                temporario[cont_temp] = matriz[linha][coluna];
                cont_temp++;
            }
        }
        Arrays.sort(temporario);
        int[][] matriz_organizada = new int[3][3];
        int espaco;
        int cont = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                espaco = temporario[cont];
                matriz_organizada[linha][coluna] = espaco;
                cont++;
            }
        }
        return matriz_organizada;
    }

    public static void maior(int[][] matriz) {
        int maior = 0;
        int contador = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (contador == 0) {
                    maior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
                contador++;
            }
        }
        System.out.printf("O maior valor da matriz é: %d%n", maior);
    }

    public static void media(int[][] matriz) {
        int total = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                total += matriz[linha][coluna];
            }
        }
        float media = (float) total / 9;
        System.out.printf("O total da matriz é de %d, sendo a média calculada como %d / %d = %.2f", total, total, 9,
                media);
    }

    public static void main(String[] args) {
        int[][] matriz = criar_matriz();
        int[][] organizada = organizar(matriz);
        System.out.println("-------> Manipulando Arrays de Arrays <-------");
        System.out.printf("A Matriz original é: %s%n", Arrays.deepToString(matriz));
        System.out.printf("A Matriz organizada em ordem crescente é: %s%n", Arrays.deepToString(organizada));
        maior(matriz);
        media(matriz);
    }
}
