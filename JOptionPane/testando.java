package JOptionPane;

import javax.swing.*;
import java.awt.*;

class testando {
    public static void main(String[] args) {
        // Icon figura = new ImageIcon("atom.jpg");

        // JOptionPane.showMessageDialog(null, "Errou feio!", "Erro", JOptionPane.PLAIN_MESSAGE, figura);

        // JOptionPane.showMessageDialog(null, "Isso aqui é uma caixinha de teste", "Teste", JOptionPane.ERROR_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Isso aqui é uma caixinha de teste", "Teste",
        //         JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Isso aqui é uma caixinha de teste", "Teste", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Isso aqui é uma caixinha de teste", "Teste", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Isso aqui é uma caixinha de teste", "Teste", JOptionPane.PLAIN_MESSAGE);

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