/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade11;

/**
 *
 * @author Aluno
 * 
 * 
 * 
 */

import javax.swing.*;
import java.awt.*;

public class atividade11 {
    public static void main(String[] args){
//        int[] numeros = {5,10,15,20,25,30,35,40,45,50};
//        int soma = 0;
//        int maior = 0;
//        int menor = 1000000;
//        
        String numero = JOptionPane.showInputDialog(null,"Informe um número: ","Teste",JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,numero,"Testando",JOptionPane.INFORMATION_MESSAGE);
        
        try{
            Integer number = Integer.valueOf(numero);
            System.out.println(number);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }
//        
//        for(int i = 0; i < numeros.length; i++){
//              soma += numeros[i];
//              if(menor>numeros[i]){
//                  menor = numeros[i];
//              }
//              
//              if(maior<numeros[i]){
//                  maior = numeros[i];
//              }
//        }
////        JOptionPane.showMessageDialog(null,"A soma desses números: " + soma);
////        
////        int media = soma/numeros.length;
////        JOptionPane.showMessageDialog(null,"A média desses números é: " + media);
////        JOptionPane.showMessageDialog(null,"O maior número é: " + maior);
////        JOptionPane.showMessageDialog(null,"O menor número é: " + menor);  
    }
}
