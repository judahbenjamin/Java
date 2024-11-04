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

public class exemplo {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null, "Escreva seu nome aí", "Pegadinha",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, texto, "O otário do ano", JOptionPane.INFORMATION_MESSAGE);

    }
}

