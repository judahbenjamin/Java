/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_code.classe.polimorfismo;

/**
 *
 * Judah Benjamin
 * Data: 08/08/24
 */
abstract class pessoa {
    int idade;
    String nome;
    pessoa(int i, String n){
        this.idade = i;
        this.nome = n;
    }
    abstract void mostrar();
}
