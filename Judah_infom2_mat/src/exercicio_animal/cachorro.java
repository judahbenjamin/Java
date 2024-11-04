/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_animal;

/**
 *
 * @Judah Benjamin
 * Data: 14/08/2024
 */
public class cachorro extends animal {
    String raca;
    int idade;
    cachorro(String n, String c, String r, int i){
        super(n, c);
        this.raca = r;
        this.idade = i;
    }
    void dados_cachorro(){
        super.dados();
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
    }
}
