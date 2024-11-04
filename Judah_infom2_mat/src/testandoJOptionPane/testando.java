/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandoJOptionPane;

/**
 *
 * @author Aluno
 */
import javax.swing.*;
import java.awt.*;

public class testando {

    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "Isso é uma mensagem simples", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Isso é uma mensagem de erro", "Mensagem", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Isso é uma mensagem de aviso", "Mensagem", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Isso é uma mensagem informativa", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Isso é uma mensagem de questionamento", "Mensagem", JOptionPane.QUESTION_MESSAGE);
        

        int opcao = JOptionPane.showConfirmDialog(null, "Você quer mesmo ler minha mensagem?", "Pergunta besta",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu ler a mensagem!", "Parabéns!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você é um imaturo!", "Porcaria!", JOptionPane.ERROR_MESSAGE);
        } else if (opcao == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Você ficou indeciso e resolveu recuar! É um fraco?", "Covarde!",
                    JOptionPane.QUESTION_MESSAGE);
        }
    }
}
