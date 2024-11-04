/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandoJOptionPane;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class tabelas {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Tabelas");
        tela.setBounds(0, 0, 1024, 768);
        JTable tabela = new JTable();
        tabela.setBounds(10, 10, 200, 400);
        tela.add(tabela);
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

                    JOptionPane.showMessageDialog(null, mensagem, "Dados", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }
        })
    
;
