package JOptionPane;

import javax.swing.JOptionPane;

public class revisao1 {
    public static void main(String[] args) {
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE; 

        int[] nums = new int[10]; 

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ",
                    JOptionPane.QUESTION_MESSAGE));

            nums[i] = num; 
            soma += num; 

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num; 
            }

            JOptionPane.showMessageDialog(null, num, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        int media = soma / nums.length;

        JOptionPane.showMessageDialog(null, "A soma desses números: " + soma, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A média desses números: " + media, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O menor número é: " + menor, "Resultados", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("A soma desses números: " + soma);
        System.out.println("A média desses números é: " + media);
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
