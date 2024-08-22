// 3 – Faça um programa que leia o número e o peso de um boi, a leitura encerra quando o
// número digitado for 0 (zero) e informe:
// a) Quantos bois foram digitados;
// b) Qual o total de peso dos bois;
// c) Qual a média de peso dos bois;
// d) Qual o número e o peso do boi mais pesado; e
// e) Qual o número e o peso do boi mais leve.

package revisão_algoritmos;

import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);

        int numero;
        float peso;
        int quant_bois = 0;
        float pesos[];
        int bois = 0;
        int answ;
        boolean cont = true;
    
        while(cont == true){
            System.out.printf("NÚMERO: ");
            numero = lendo.nextInt();

            System.out.printf("PESO DO BOI: ");
            peso = lendo.nextFloat();

            System.out.printf("Deseja continuar? (S - 1) ; (N - 0) ");
            answ = lendo.nextInt();

            if(answ == 0){
                System.out.println("ENCERRADO...");
                break;
            }
        }


    }

}
