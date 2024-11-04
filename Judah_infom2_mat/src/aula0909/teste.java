/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0909;

/**
 *
 * @author Aluno
 */
import javax.swing.*;
import java.awt.*;

public class teste {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Telex");
        JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);

        tela.setBounds(100, 100, 800, 600);
        tabs.setBounds(10, 10, 770, 550);

        JPanel painel1 = new JPanel();
        painel1.setBackground(Color.RED);
        JPanel painel2 = new JPanel();
        painel2.setBackground(Color.BLUE);

        tabs.add("Primeiro", painel1);
        tabs.add("Segundo", painel2);

        JComboBox comb1 = new JComboBox();
        comb1.setBounds(100, 100, 150, 35);
        comb1.addItem("Gaúcho");
        comb1.addItem("Baiano");
        comb1.addItem("Paulista");
        comb1.addItem("Carioca");
        comb1.setEditable(false);
        comb1.setSelectedIndex(0);
        
        JComboBox comb2 = new JComboBox();
        comb2.setBounds(100, 100, 150, 35);
        comb2.addItem("Informática");
        comb2.addItem("Mecânica");
        comb2.addItem("Jogos");
        comb2.addItem("Administração");
        comb2.setEditable(false);
        comb2.setSelectedIndex(0);
        
        painel1.add(comb1);
        painel1.add(comb2);
                
        tela.add(tabs);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
