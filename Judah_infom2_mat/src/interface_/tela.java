///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package interface_;
//
/////**
//// *
//// * @author Aluno
//// */
////
////import javax.swing.*;
////import java.awt.*;
////
////public class tela {
////    public static void main(String[] args){
////        JFrame tela = new JFrame("Primeira tela");
////        tela.setBounds(100,100,600,400);
////        tela.getContentPane().setBackground(Color.RED);
////        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        tela.setLayout(null);
////        tela.setVisible(true);
////        
////         JFrame tela2 = new JFrame("Segunda tela");
////        tela2.setBounds(100,100,600,400);
////        tela2.getContentPane().setBackground(Color.BLUE);
////        tela2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        tela2.setLayout(null);
////        tela2.setVisible(true);
////    }
////}
//import javax.swing.*;
//import java.awt.*;
//
//class classetela {
//
//    public static void main(String[] args) {
//        JFrame tela = new JFrame("Primeira tela");
//        JLabel texto = new JLabel("Frase indicativa");
//        tela.setBounds(100, 100, 600, 400);
//        tela.getContentPane().setBackground(Color.YELLOW);
//        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        texto.setBounds(100, 100, 200, 30);
//        tela.setLayout(null);
//        tela.add(texto);
//
//        JButton botao = new JButton("Pressione aqui");
//        botao.setBounds(100, 200, 200, 30);
//        botao.setBackground(Color.GREEN);
//        botao.setForeground(Color.BLUE);
//        botao.setToolTipText("Um exemplo de ToolTip");
//        tela.add(botao);
//
//        JTextField caixa = new JTextField();
//        caixa.setBounds(100, 300, 200, 30);
//        caixa.setBackground(Color.RED);
//        caixa.setForeground(Color.WHITE);
//        tela.add(caixa);
//
//        JToggleButton toglebotao = new JToggleButton("Toggle Button");
//        toglebotao.setBounds(300, 200, 200, 30);
//        toglebotao.setBackground(Color.GREEN);
//        toglebotao.setForeground(Color.BLUE);
//        toglebotao.setToolTipText("Um exemplo de ToolTip");
//        tela.add(toglebotao);
//
//        tela.setVisible(true);
//
//        JOptionPane.showMessageDialog(null, "Uma mensagem!", "Titulo", JOptionPane.ERROR_MESSAGE);
//
//        int opcao = JOptionPane.showConfirmDialog(null, "Você quer mesmo ler minha mensagem?", "Pergunta besta",
//                JOptionPane.YES_NO_CANCEL_OPTION);
//        if (opcao == JOptionPane.OK_OPTION) {
//            JOptionPane.showMessageDialog(null, "Você escolheu ler a mensagem!", "Parabéns!",
//                    JOptionPane.INFORMATION_MESSAGE);
//        } else if (opcao == JOptionPane.NO_OPTION) {
//            JOptionPane.showMessageDialog(null, "Você é um imaturo!", "Porcaria!", JOptionPane.ERROR_MESSAGE);
//        } else if (opcao == JOptionPane.CANCEL_OPTION) {
//            JOptionPane.showMessageDialog(null, "Você ficou indeciso e resolveu recuar! É um fraco?", "Covarde!",
//                    JOptionPane.QUESTION_MESSAGE);
//        }
//        
//        
//    }
//}
//

import javax.swing.*;
import java.awt.*;

class optiones {

    public static void main(String[] args) {

        String[] botoes = {"Avançar", "Voltar", "Desistir", "CTRL+ALT+DEL", "Testar"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Sem saída",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
        JOptionPane.showMessageDialog(null, botoes[opcao], "Opção escolhida", JOptionPane.WARNING_MESSAGE);

    }
}
