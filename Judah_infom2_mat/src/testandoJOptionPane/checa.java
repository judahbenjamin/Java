/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandoJOptionPane;

import java.awt.event.*;
import javax.swing.*;

public class checa {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Checks!");
        tela.setBounds(10, 10, 800, 600);
        tela.setLayout(null);
        final JCheckBox pizza = new JCheckBox("Quero uma Pizza.");
        final JCheckBox refri = new JCheckBox("Quero um refri.");
        pizza.setBounds(100, 30, 200, 35);
        refri.setBounds(100, 80, 200, 35);
        pizza.setSelected(true);
        tela.add(pizza);
        tela.add(refri);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

        boolean x = pizza.isSelected();
    }
}
