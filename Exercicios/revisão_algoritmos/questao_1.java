// JUDAH BENJAMIN - 21/08/2024

// 1 – Faça um programa que leia 10 números e informe:
// a) A soma destes números;
// b) A média destes números;
// c) O maior número; e
// d) O menor número.

package revisão_algoritmos;

public class questao_1 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int soma = 0;
        int maior = 0;
        int menor = 1000000;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
            if(menor>numeros[i]){
                menor = numeros[i];
            }

            if(maior<numeros[i]){
                maior = numeros[i];
            }
        }
        System.out.println("A soma desses números: " + soma);

        int media = soma/numeros.length;
        System.out.println("A média desses números é: " + media);
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }   
}