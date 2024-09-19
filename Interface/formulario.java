package atividade12;

/**
 *
 * Por Judah Benjamin,
 * 19/09/2024
 */

import javax.swing.*;
import java.awt.*;

public class formulario {
    public static void main(String[] args){
        
        JFrame form = new JFrame();
        form.setBounds(300,300,630,1000);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.getContentPane().setBackground(Color.WHITE);
        form.setLayout(null);
        
        JLabel titulo = new JLabel();
        titulo.setText("Cadastro de funcionários");
        titulo.setBounds(70,0,500,100);
        titulo.setFont(new Font("Arial",Font.BOLD,38));
        titulo.setForeground(Color.black);
        form.add(titulo);
        
        JLabel matricula = new JLabel();
        JTextField campo_matricula = new JTextField();
        matricula.setText("Matrícula:");
        matricula.setBounds(70,70,500,100);
        matricula.setFont(new Font("Arial",Font.ITALIC,17));
        campo_matricula.setBounds(70,150,468,40);
        form.add(matricula);
        form.add(campo_matricula);
        
        JLabel nome = new JLabel();
        JTextField campo_nome = new JTextField();
        nome.setText("Nome Completo:");
        nome.setBounds(70,170,500,100);
        nome.setFont(new Font("Arial",Font.ITALIC,17));
        campo_nome.setBounds(70,250,468,40);
        form.add(nome);
        form.add(campo_nome);
        
        JLabel data = new JLabel();
        JTextField campo_data = new JTextField();
        data.setText("Data de Nascimento:");
        data.setBounds(70,270,500,100);
        data.setFont(new Font("Arial",Font.ITALIC,17));
        campo_data.setBounds(70,350,468,40);
        form.add(data);
        form.add(campo_data);
        
        JLabel rg = new JLabel();
        JTextField campo_rg = new JTextField();
        rg.setText("RG:");
        rg.setBounds(70,370,500,100);
        rg.setFont(new Font("Arial",Font.ITALIC,17));
        campo_rg.setBounds(70,450,220,40);
        form.add(rg);
        form.add(campo_rg);
        
        JLabel cpf = new JLabel();
        JTextField campo_cpf = new JTextField();
        cpf.setText("CPF:");
        cpf.setBounds(320,370,500,100);
        cpf.setFont(new Font("Arial",Font.ITALIC,17));
        campo_cpf.setBounds(320,450,220,40);
        form.add(cpf);
        form.add(campo_cpf);
        
        JLabel endereco = new JLabel();
        JTextField campo_endereco = new JTextField();
        endereco.setText("Endereço:");
        endereco.setBounds(70,470,500,100);
        endereco.setFont(new Font("Arial",Font.ITALIC,17));
        campo_endereco.setBounds(70,550,220,40);
        form.add(endereco);
        form.add(campo_endereco);
        
        JLabel cidade = new JLabel();
        JTextField campo_cidade = new JTextField();
        cidade.setText("Cidade:");
        cidade.setBounds(320,470,500,100);
        cidade.setFont(new Font("Arial",Font.ITALIC,17));
        campo_cidade.setBounds(320,550,150,40);
        form.add(cidade);
        form.add(campo_cidade);
        
        JLabel estado = new JLabel();
        JTextField campo_estado = new JTextField();
        estado.setText("Estado:");
        estado.setBounds(485,470,500,100);
        estado.setFont(new Font("Arial",Font.ITALIC,17));
        campo_estado.setBounds(485,550,55,40);
        form.add(estado);
        form.add(campo_estado);
        
        JLabel cep = new JLabel();
        JTextField campo_cep = new JTextField();
        cep.setText("CEP:");
        cep.setBounds(70,570,500,100);
        cep.setFont(new Font("Arial",Font.ITALIC,17));
        campo_cep.setBounds(70,650,220,40);
        form.add(cep);
        form.add(campo_cep);
        
        JLabel setor = new JLabel();
        JTextField campo_setor = new JTextField();
        setor.setText("Setor de trabalho:");
        setor.setBounds(320,570,500,100);
        setor.setFont(new Font("Arial",Font.ITALIC,17));
        campo_setor.setBounds(320,650,220,40);
        form.add(setor);
        form.add(campo_setor);
        
        JLabel cargo = new JLabel();
        JTextField campo_cargo = new JTextField();
        cargo.setText("Cargo:");
        cargo.setBounds(70,670,500,100);
        cargo.setFont(new Font("Arial",Font.ITALIC,17));
        campo_cargo.setBounds(70,750,468,40);
        form.add(cargo);
        form.add(campo_cargo);
        
        JButton botao = new JButton();
        botao.setText("Enviar");
        botao.setFont(new Font("Arial",Font.BOLD,20));
        botao.setBounds(240,840,140,50);
        botao.setBackground(Color.BLUE);
        botao.setForeground(Color.WHITE);
        form.add(botao);
        
        form.setVisible(true);
    }
}
