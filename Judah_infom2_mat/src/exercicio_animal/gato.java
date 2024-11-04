/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_animal;

/**
 * Judah Benjamin
 * Data: 14/08/2024
 */
public class gato extends animal{
    int idade;
    gato(String n, String c, int i){
        super(n, c);
        this.idade = i;
    }
    void dados_gatos(){
        super.dados();
        System.out.println("Idade: " + idade);
    }
    
    void miar(){
        System.out.println("Eu faço miau!!!");
    }
}
