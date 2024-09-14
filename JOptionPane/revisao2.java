package JOptionPane;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class revisao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int maior_idade = 0;
        int menor_idade = 0;
        int contador = 0;
        int quant_masc = 0;
        int quant_fem = 0;
        String nome_velho = "";
        String nome_novo = "";
        int tot_idade = 0;
        boolean continuar = true;

        while(continuar == true){
            String nome = JOptionPane.showInputDialog(null,"Informe o nome da pessoa: ","TESTE",JOptionPane.QUESTION_MESSAGE);
            
            if (nome.equals("FIM")) {
                continuar = false;
                break;
            }

            int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade da pessoa: ","Teste",JOptionPane.QUESTION_MESSAGE));

            String sexo = JOptionPane.showInputDialog(null,"Informe o seu sexo: ","teste",JOptionPane.QUESTION_MESSAGE);

            if (contador == 0){
                maior_idade = idade;
                nome_velho = nome;
                menor_idade = idade;
                nome_novo = nome;
            }
            
            if (idade > maior_idade){
                maior_idade = idade;
                nome_velho = nome;
            }
            
            if (idade < menor_idade){
                menor_idade = idade;
                nome_novo = nome;
            }
            
            if (sexo.equals("M")){
                quant_masc += 1;
            }
            else{
                quant_fem += 1;
            }
            
            tot_idade = tot_idade + idade;
            contador += 1;
        }
        System.out.println("PROGRAMA FINALIZADO...");

        int media = tot_idade/contador;

        JOptionPane.showMessageDialog(null, "A pessoa mais velha é " + nome_velho + " tem " + maior_idade + " anos.", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A pessoa mais nova é " + nome_novo + " tem " + menor_idade + " anos.", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas do sexo feminino é " + quant_fem, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas do sexo masculino é " + quant_masc, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas digitadas foram " + contador + " com média de " + media + " de idade.", "Resultados", JOptionPane.INFORMATION_MESSAGE);

        System.out.println();
        System.out.println("A pessoa mais velha é " + nome_velho + " tem " + maior_idade + " anos.");
        System.out.println("A pessoa mais nova é " + nome_novo + " tem " + menor_idade + " anos.");
        System.out.println("A quantidade de pessoas do sexo feminino é: " + quant_fem);
        System.out.println("A quantidade de pessoas do sexo masculino é: " + quant_masc);
        System.out.println("Quantidade de pessoas digitadas foram " + contador + " com media de " + media + " de idade." );
}
}