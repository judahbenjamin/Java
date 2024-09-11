package JOptionPane;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class revisao1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int soma = 0;
        int maior = 0;
        int menor = 1000000;

        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: ",
            JOptionPane.QUESTION_MESSAGE));

            JOptionPane.showMessageDialog(null, num, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        System.out.println(nums);

        int media = soma/nums.length;

        JOptionPane.showMessageDialog(null,"A soma desses números: " + soma, "Results", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"A média desses números: " + media, "Results", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"O maior número é: " + maior, "Results", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"O menor número é: " + menor, "Results", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("A soma desses números: " + soma);

        System.out.println("A média desses números é: " + media);
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
