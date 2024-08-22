//JUDAH BENJAMIN - 22/08/2024

// 4 – Faça um programa que gere um vetor de 10 posições para números inteiros, preencha
// o vetor com números diversos, organize o vetor do menor para o maior e mostre:
// a) O vetor digitado originalmente;
// b) O vetor organizado do menor para o maior;

package revisão_algoritmos;

public class questao_4 {
    public static void main(String[] args) {
        int[] vetor_num = new int[10];

        vetor_num[0] = 10;
        vetor_num[1] = 22;
        vetor_num[2] = 15;
        vetor_num[3] = 1;
        vetor_num[4] = 97;
        vetor_num[5] = 235;
        vetor_num[6] = 110;
        vetor_num[7] = 89;
        vetor_num[8] = 155;
        vetor_num[9] = 347;
        
        System.out.println("O vetor digitado originalmente:");
        for(int i = 0; i < vetor_num.length; i++){
            System.out.println(vetor_num[i]);
        }

        System.out.println("O vetor organizado do menor para o maior:");
        for(int i = 0; i < vetor_num.length - 1; i++){
            for(int j = i + 1; j < vetor_num.length; j++){
                if(vetor_num[i] > vetor_num[j]){
                    int temp = vetor_num[i];
                    vetor_num[i] = vetor_num[j];
                    vetor_num[j] = temp;
                }
            }
        }

        String texto = "";
        for(int i = 0; i < vetor_num.length; i++){
            texto += "Posição: " + i + " Valor: " + vetor_num[i] + "\n";
        }

        System.out.println(texto);
    }
}
