//JUDAH BENJAMIN - 22/08/2024

// 5 - Faça um programa que gere uma matriz de 3 x 3, que receba números aleatórios,
// organize esta matriz do maior para o menor e mostre:
// a) A matriz digitada originalmente;
// b) A matriz organizada do menor para o maior;
// c) O maior valor da matriz;
// d) A média dos números digitados na matriz.

package revisão_algoritmos;

import java.security.SecureRandom;
public class questao_5 {
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 3;

        int[][] nums = new int[linhas][colunas];

        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                nums[l][c] = new SecureRandom().nextInt(100);
            }
        }

        System.out.println("A matriz digitada originalmente: ");
        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                System.out.printf("%2d | ",nums[l][c]);
            }
            System.out.println("%n");
        }
    }
}
