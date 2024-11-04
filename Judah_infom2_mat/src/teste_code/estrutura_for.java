/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_code;

/**
 * Aula de Java - Estrutura de repetição for
 *  Data: 01/08/2024
 * @author Judah
 */
public class estrutura_for {
    
    public static void main (String[] args){ //isso aqui é um teste do laço for
        for(int x = 1; x < 34; x++){
            System.out.println("Você está correndo pela "+ x +"° vez!"); //Repetindo o x no meio da linha
            System.out.println("Esse foi sua " + x + "° corrida"); //Repetindo o x no meio da linha
            System.out.println( x + "° Vitória!"); //Repetindo o x no inicio da linha
            System.out.println(""); //Aqui é para dar um espaço ao final de toda repetição
        }
        System.out.println("Saiu do laço de repetição"); //Saiu...
    }
            
}
