/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class acao {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Teste");
        JButton botao = new JButton("Aperte aqui");
        tela.setBounds(10, 10, 600, 400);
        botao.setBounds(100, 100, 150, 35);

        ActionListener ac = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ("botao1".equals(e.getActionCommand())) {
                    JOptionPane.showMessageDialog(null, "Apertou o botão!", "Olá!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        };

        botao.setActionCommand("botao1");
        botao.addActionListener(ac);

        tela.setLayout(null);
        tela.add(botao);
        tela.setVisible(true);

    }
}
