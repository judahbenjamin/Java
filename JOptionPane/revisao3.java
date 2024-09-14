package JOptionPane;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class revisao3 {
    public static void main(String[] args) {
        System.out.println(" -------- Contando os bois -------- ");
        Scanner scanner = new Scanner(System.in);
        
        boolean chave = true;
        int contador = 0;
        float tot_peso = 0;
        int num_pesado = 0;
        float mais_pesado = 0;
        int num_leve = 0;
        float mais_leve = 0;
        
        while(chave){
            int num_boi = Integer.parseInt(JOptionPane.showInputDialog(null,"Número do boi: ","teste",JOptionPane.QUESTION_MESSAGE));
            
            if(num_boi==0){
                for(int c = 0; c <= 5; c++){
                    System.out.println("-");
                }
                System.out.println();
                break;
            }
            
            float peso_boi = Float.valueOf(JOptionPane.showInputDialog(null,"Peso do boi: ","teste",JOptionPane.QUESTION_MESSAGE));
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

        JOptionPane.showMessageDialog(null, "Quantidade de bois: " + contador, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Total de peso dos bois: " + tot_peso, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Média peso dos bois: " + media, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O boi mais pesado foi o n° " + num_pesado + " com peso de " + mais_pesado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O boi mais leve foi o n° " + num_leve + " com peso de " + mais_leve, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Quantidade de bois: " + contador);
        System.out.println("Total peso dos bois: " + tot_peso);
        System.out.printf("Média peso dos bois: %.2f %n", media);
        System.out.println("O boi mais pesado foi o n° " + num_pesado +" com peso de " + mais_pesado);
        System.out.println("O boi mais leve foi o n° " + num_leve + " com peso de " + mais_leve);

        System.out.println("PROGRAMA FINALIZADO...");
    }
}
