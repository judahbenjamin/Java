/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_algoritmos;

/**
 *
 * Judah Benjamin - 29/08/24
 */

import java.util.Arrays;
import java.util.Random;

public class quest_5 {
    public static int[][] criar_matriz (){
        Random random = new Random();
        
        int[][] matriz = new int[3][3];
        
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                matriz[linha][coluna] = random.nextInt(10);
            }
        }
        return matriz;
    }
}
