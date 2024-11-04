/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_;

/**
 *
 * Judah Benjamin - 05/09/2024
 */

import javax.swing.*;
import java.awt.*;

public class calculadora_judah {
        public static void main(String[] args){
            JFrame tela = new JFrame("Calculadora");
            tela.setBounds(90,90,410,550);
            tela.getContentPane().setBackground(Color.WHITE);
            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.setLayout(null);
            
            JTextField caixa = new JTextField();
            caixa.setBounds(20,30, 359,90);
            caixa.setBackground(Color.WHITE);
            caixa.setForeground(Color.GRAY); 
            tela.add(caixa);
            
            JButton botao1= new JButton("7");
            botao1.setBounds(22,170,80,60);
            botao1.setBackground(Color.GREEN);
            botao1.setForeground(Color.BLUE);
            botao1.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao1);
            
            JButton botao2= new JButton("8");
            botao2.setBounds(115,170,80,60);
            botao2.setBackground(Color.GREEN);
            botao2.setForeground(Color.BLUE);
            botao2.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao2);
            
            JButton botao3= new JButton("9");
            botao3.setBounds(205,170,80,60);
            botao3.setBackground(Color.GREEN);
            botao3.setForeground(Color.BLUE);
            botao3.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao3);
            
            JButton botao4= new JButton("/");
            botao4.setBounds(298,170,80,60);
            botao4.setBackground(Color.blue);
            botao4.setForeground(Color.WHITE);
            botao4.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao4);
            
            JButton botao5= new JButton("4");
            botao5.setBounds(22,250,80,60);
            botao5.setBackground(Color.GREEN);
            botao5.setForeground(Color.BLUE);
            botao5.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao5);
            
            JButton botao6= new JButton("5");
            botao6.setBounds(115,250,80,60);
            botao6.setBackground(Color.GREEN);
            botao6.setForeground(Color.BLUE);
            botao6.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao6);
            
            JButton botao7= new JButton("6");
            botao7.setBounds(205,250,80,60);
            botao7.setBackground(Color.GREEN);
            botao7.setForeground(Color.BLUE);
            botao7.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao7);
            
            JButton botao8= new JButton("X");
            botao8.setBounds(298,250,80,60);
            botao8.setBackground(Color.blue);
            botao8.setForeground(Color.WHITE);
            botao8.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao8);
            
            JButton botao9= new JButton("1");
            botao9.setBounds(22,330,80,60);
            botao9.setBackground(Color.GREEN);
            botao9.setForeground(Color.BLUE);
            botao9.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao9);
            
            JButton botao10= new JButton("2");
            botao10.setBounds(115,330,80,60);
            botao10.setBackground(Color.GREEN);
            botao10.setForeground(Color.BLUE);
            botao10.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao10);
            
            JButton botao11= new JButton("3");
            botao11.setBounds(205,330,80,60);
            botao11.setBackground(Color.GREEN);
            botao11.setForeground(Color.BLUE);
            botao11.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao11);
            
            JButton botao12= new JButton("+");
            botao12.setBounds(298,330,80,60);
            botao12.setBackground(Color.blue);
            botao12.setForeground(Color.WHITE);
            botao12.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao12);
            
            JButton botao13= new JButton("0");
            botao13.setBounds(22,410,80,60);
            botao13.setBackground(Color.GREEN);
            botao13.setForeground(Color.BLUE);
            botao13.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao13);
            
            JButton botao14= new JButton(".");
            botao14.setBounds(115,410,80,60);
            botao14.setBackground(Color.GREEN);
            botao14.setForeground(Color.BLUE);
            botao14.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao14);
            
            JButton botao15= new JButton("=");
            botao15.setBounds(205,410,80,60);
            botao15.setBackground(Color.GREEN);
            botao15.setForeground(Color.BLUE);
            botao15.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao15);
            
            JButton botao16= new JButton("-");
            botao16.setBounds(298,410,80,60);
            botao16.setBackground(Color.blue);
            botao16.setForeground(Color.WHITE);
            botao16.setToolTipText("Um exemplo de ToolTip");
            tela.add(botao16);
            
            tela.setVisible(true);
        }
}
