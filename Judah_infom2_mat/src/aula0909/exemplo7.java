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

public class exemplo7 {

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
        
        tela.add(tabs);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
