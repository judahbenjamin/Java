package JOptionPane;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.*;

import java.awt.*;

public class testando2 {
    public static void main(String[] args) {

        // JFrame jFrame = new JFrame("Testando 1");
        // jFrame.setVisible(true);
        // jFrame.setSize(900, 600);
        // jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jFrame.setResizable(false);
        // jFrame.setLocationRelativeTo(null);

        JFrame tela = new JFrame("Primeira tela");
        JLabel texto = new JLabel("Frase indicativa exemplo");
        // configurações da tela
        tela.setBounds(100, 100, 900, 700); // Posição e tamanho da tela
        tela.getContentPane().setBackground(Color.white); // Colocar a cor de fundo da tela
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para quando clicar no X, a tela fechar de vez.
        // configurações do texto
        texto.setBounds(100, 100, 200, 30); // Posição e tamanho do texto
        tela.setLayout(null);
        tela.setResizable(false);
        tela.add(texto); // Adicionar o texto na tela
        tela.setVisible(true); // Visualização da tela

        JButton jButton = new JButton();
        jButton.setText("Clique aqui"); // Texto pro botão
        jButton.setBounds(180, 200, 220, 70); // Posição e tamanho do botão
        jButton.setFont(new Font("Arial", Font.ITALIC, 20)); // Definição da fonte e seu tamanho
        jButton.setForeground(Color.black); // Definição da cor do texto do botão
        jButton.setBackground(Color.white); // Definição da cor de fundo do botão
        tela.add(jButton); // Adicionar o botão na tela
        
        // JButton botao = new JButton("Pressione aqui");
        // botao.setBounds(100, 200, 200, 30);
        // botao.setBackground(Color.GREEN);
        // botao.setForeground(Color.BLUE);
        // botao.setToolTipText("Um exemplo de ToolTip");
        // tela.add(botao);
        
        JTextField caixa = new JTextField();
        caixa.setBounds(100, 300, 200, 30); // Posição e tamanho da caixa de texto
        caixa.setBackground(Color.RED); // Cor de fundo da caixa de texto
        caixa.setForeground(Color.WHITE); // Cor do texto na caixa de texto
        tela.add(caixa);
        
        JToggleButton toglebotao = new JToggleButton("Toggle Button");
        toglebotao.setBounds(100, 90, 200, 30); //Posição e tamanho do botão
        toglebotao.setBackground(Color.GREEN); //Cor de fundo do botão
        toglebotao.setForeground(Color.BLUE); //Cor do texto do botão
        toglebotao.setToolTipText("Um exemplo de ToolTip");
        tela.add(toglebotao);
        
        // JFrame tela2 = new JFrame();
        // tela2.setBounds(0, 0, 800, 600);
        // try {
        // txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        // txtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
        // txtCNPJ = new JFormattedTextField(new MaskFormatter("###.###.###/####-##"));
        // } catch (Exception erro) {
        // JOptionPane.showMessageDialog(null, "Essa porcaria deu problema");
        // }

        // tela2.add(txtCPF);
        // tela2.add(txtData);
        // tela2.add(txtCNPJ);

        // tela.setLayout(null);
        // tela.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        // tela.setVisible(true);

        Icon imagem = new ImageIcon("atom.jpg");
        JButton botao = new JButton();
        botao.setIcon(imagem);

        JLabel rotulo = new JLabel();
        rotulo.setIcon(imagem);

    }
}
