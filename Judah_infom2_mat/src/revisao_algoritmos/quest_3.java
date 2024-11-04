/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_algoritmos;

/**
 *
 * Judah Benjamin - 22/08/24
 */

// 3 – Faça um programa que leia o número e o peso de um boi, a leitura encerra quando o número digitado for 0 (zero) e informe:
// a)	Quantos bois foram digitados;
// b)	Qual o total de peso dos bois;
// c)	Qual a média de peso dos bois;
// d)	Qual o número e o peso do boi mais pesado; e
// e)	Qual o número e o peso do boi mais leve.

import java.util.Scanner;
import java.util.ArrayList;

public class quest_3 {
    public static void main (String[] args){
        System.out.println("-----> Balanço do Rancho Faro <------- ");
        Scanner scanner = new Scanner(System.in);
        
        int num_boi = 0;
        float peso_boi = 0;
        boolean chave = true;
        int contador = 0;
        float tot_peso = 0;
        int num_pesado = 0;
        float mais_pesado = 0;
        int num_leve = 0;
        float mais_leve = 0;
        
        while(chave){
            System.out.printf("Número do boi: ");
            num_boi = scanner.nextInt();
            
            if(num_boi==0){
                for(int c = 0; c <= 10; c++){
                    System.out.println("-");
                }
                System.out.println();
                break;
            }
            
            System.out.printf("Peso do boi: ");
            peso_boi = scanner.nextFloat();
            tot_peso += peso_boi;
            
            if(contador == 0){
                num_pesado = num_leve = num_boi;
                mais_pesado = mais_leve = peso_boi;
            }
            
            if(peso_boi > mais_pesado){
                mais_pesado = peso_boi;
                num_pesado = num_boi;
            }
            
            if(peso_boi < mais_leve){
                mais_leve = peso_boi;
                num_leve = num_boi;
            }
            
            contador++;
            for(int c = 0; c <= 30; c++){
                System.out.println("-");
            }
            System.out.println();
        }
        float media = tot_peso/contador;
        
        System.out.println("Quantidade de bois: " + contador);
        System.out.println("Total peso dos bois: " + tot_peso);
        System.out.println("Média peso dos bois: " + media);
        System.out.println("O boi mais pesado foi o n°" + num_leve +" com peso de " + mais_leve);
        
    }
}
