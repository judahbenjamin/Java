package atividade13;

/**
 *
 * Por Judah Benjamin, 19/09/2024
 */
import javax.swing.*;
import sun.audio.*;
import com.sun.java.util.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.*;
import java.io.*;

public class JInternal {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Tela de teste");
        JDesktopPane deska = new JDesktopPane();
        final JInternalFrame telinha1 = new JInternalFrame("Tela Interna 1", true, true, true, true);
        final JInternalFrame telinha2 = new JInternalFrame("Tela Interna 2", true, true, true, true);
        final JInternalFrame telinha3 = new JInternalFrame("Tela Interna 3", true, true, true, true);

        telinha1.setBounds(0, 0, 400, 500);
        telinha2.setBounds(0, 0, 400, 500);
        telinha3.setBounds(0, 0, 400, 500);
        telinha1.hide();
        telinha2.hide();
        telinha3.hide();
        telinha1.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        telinha2.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        telinha3.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);

        JMenuItem t1 = new JMenuItem("Tela Calculadora");
        JMenuItem t2 = new JMenuItem("Exemplo Menu");
        JMenuItem t3 = new JMenuItem("Tela Tabela");
        JMenuBar barra = new JMenuBar();
        JMenu calculadora = new JMenu("Calculadora");
        barra.add(calculadora);
        calculadora.add(t1);
        JMenu exemplo = new JMenu("Exemplo Menu");
        barra.add(exemplo);
        exemplo.add(t2);
        JMenu tabela = new JMenu("Tela Tabela");
        barra.add(tabela);
        tabela.add(t3);

        t1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                telinha1.show();
                telinha1.setBounds(90, 90, 410, 550);
                telinha1.getContentPane().setBackground(Color.WHITE);
                telinha1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                telinha1.setLayout(null);

                JTextField caixa = new JTextField();
                caixa.setBounds(20, 30, 359, 90);
                caixa.setBackground(Color.WHITE);
                caixa.setForeground(Color.GRAY);
                telinha1.add(caixa);

                JButton botao1 = new JButton("7");
                botao1.setBounds(22, 170, 80, 60);
                botao1.setBackground(Color.GREEN);
                botao1.setForeground(Color.BLUE);
                botao1.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao1);

                JButton botao2 = new JButton("8");
                botao2.setBounds(115, 170, 80, 60);
                botao2.setBackground(Color.GREEN);
                botao2.setForeground(Color.BLUE);
                botao2.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao2);

                JButton botao3 = new JButton("9");
                botao3.setBounds(205, 170, 80, 60);
                botao3.setBackground(Color.GREEN);
                botao3.setForeground(Color.BLUE);
                botao3.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao3);

                JButton botao4 = new JButton("/");
                botao4.setBounds(298, 170, 80, 60);
                botao4.setBackground(Color.blue);
                botao4.setForeground(Color.WHITE);
                botao4.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao4);

                JButton botao5 = new JButton("4");
                botao5.setBounds(22, 250, 80, 60);
                botao5.setBackground(Color.GREEN);
                botao5.setForeground(Color.BLUE);
                botao5.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao5);

                JButton botao6 = new JButton("5");
                botao6.setBounds(115, 250, 80, 60);
                botao6.setBackground(Color.GREEN);
                botao6.setForeground(Color.BLUE);
                botao6.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao6);

                JButton botao7 = new JButton("6");
                botao7.setBounds(205, 250, 80, 60);
                botao7.setBackground(Color.GREEN);
                botao7.setForeground(Color.BLUE);
                botao7.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao7);

                JButton botao8 = new JButton("X");
                botao8.setBounds(298, 250, 80, 60);
                botao8.setBackground(Color.blue);
                botao8.setForeground(Color.WHITE);
                botao8.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao8);

                JButton botao9 = new JButton("1");
                botao9.setBounds(22, 330, 80, 60);
                botao9.setBackground(Color.GREEN);
                botao9.setForeground(Color.BLUE);
                botao9.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao9);

                JButton botao10 = new JButton("2");
                botao10.setBounds(115, 330, 80, 60);
                botao10.setBackground(Color.GREEN);
                botao10.setForeground(Color.BLUE);
                botao10.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao10);

                JButton botao11 = new JButton("3");
                botao11.setBounds(205, 330, 80, 60);
                botao11.setBackground(Color.GREEN);
                botao11.setForeground(Color.BLUE);
                botao11.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao11);

                JButton botao12 = new JButton("+");
                botao12.setBounds(298, 330, 80, 60);
                botao12.setBackground(Color.blue);
                botao12.setForeground(Color.WHITE);
                botao12.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao12);

                JButton botao13 = new JButton("0");
                botao13.setBounds(22, 410, 80, 60);
                botao13.setBackground(Color.GREEN);
                botao13.setForeground(Color.BLUE);
                botao13.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao13);

                JButton botao14 = new JButton(".");
                botao14.setBounds(115, 410, 80, 60);
                botao14.setBackground(Color.GREEN);
                botao14.setForeground(Color.BLUE);
                botao14.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao14);

                JButton botao15 = new JButton("=");
                botao15.setBounds(205, 410, 80, 60);
                botao15.setBackground(Color.GREEN);
                botao15.setForeground(Color.BLUE);
                botao15.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao15);

                JButton botao16 = new JButton("-");
                botao16.setBounds(298, 410, 80, 60);
                botao16.setBackground(Color.blue);
                botao16.setForeground(Color.WHITE);
                botao16.setToolTipText("Um exemplo de ToolTip");
                telinha1.add(botao16);
            }
        });

        t2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame telinha2 = new JFrame("Telex");
                JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);
                telinha2.setBounds(100, 100, 800, 600);
                tabs.setBounds(10, 10, 770, 550);
                JPanel painel1 = new JPanel();
                painel1.setBackground(Color.RED);
                JPanel painel2 = new JPanel();
                painel2.setBackground(Color.BLUE);
                tabs.add("Primeiro", painel1);
                tabs.add("Segundo", painel2);
                telinha2.add(tabs);
                telinha2.setLayout(null);
                telinha2.setVisible(true);
            }
        });

        t3.addActionListener(new ActionListener() {
            public void actionPerfomed(ActionEvent e) {
                JFrame telinha3 = new JFrame("Tabelas");
                telinha3.setBounds(0, 0, 1024, 768);
                JTable tabela = new JTable();
                tabela.setBounds(10, 10, 200, 400);
                telinha3.add(tabela);

                String[] colunas = {"Nome", "Salário"};

                DefaultTableModel modelo = (DefaultTableModel) (new DefaultTableModel() {
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                });

                modelo.setColumnIdentifiers(colunas);
                modelo.setRowCount(0);

                Object[] objetos = new Object[2];

                objetos[0] = "Zé das Couves";
                objetos[1] = "1000";
                modelo.addRow(objetos);
                objetos[0] = "Silvio Santos";
                objetos[1] = "50000";
                modelo.addRow(objetos);
                objetos[0] = "Lula-lá";
                objetos[1] = "12000";
                modelo.addRow(objetos);

                tabela.setModel(modelo);
                tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tela.setLayout(null);
                tela.setVisible(true);
                
                tabela.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent e) {
                        if (e.getClickCount() == 2) {
                            int linha = tabela.getSelectedRow();
                            String mensagem = (tabela.getValueAt(linha, 0).toString()) + " ganha R$ "
                                    + (tabela.getValueAt(linha, 1).toString());
                
            }
        });

        deska.add(telinha1);
        deska.add(telinha2);
        deska.add(telinha3);
        tela.add(deska);
        tela.setJMenuBar(barra);

        tela.setBounds(10, 10, 1000, 800);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
