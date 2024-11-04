/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_animal;

/**
 * @Judah Benjamin
 * Data: 14/08/2024
 */
public class animal {
    String nome;
    String classificacao;
    animal(String n, String c){
        this.nome = n;
        this.classificacao = c;
    }
    void dados(){
        System.out.println("Nome do animal: " + nome);
        System.out.println("Classificacao: " + classificacao);
    }
}
