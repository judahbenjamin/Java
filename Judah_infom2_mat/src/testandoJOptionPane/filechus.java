/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandoJOptionPane;

import javax.swing.*;
import sun.audio.*;
import com.sun.java.util.*;
import java.awt.*;
import java.awt.Event.*;
import java.io.*;

public class filechus {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Telex");
        JFileChooser filex = new JFileChooser();
        int opcao = filex.showOpenDialog(tela);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            File nomearquivo = filex.getSelectedFile();
            try {
                InputStream arq = new FileInputStream(nomearquivo);
                AudioStream som = new AudioStream(arq);
                AudioPlayer.player.start(som);
                System.out.println("Tocando");
            } catch (Exception e) {
                System.out.println("Deu merda");
            }
        }
        tela.setBounds(10, 10, 800, 600);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}    