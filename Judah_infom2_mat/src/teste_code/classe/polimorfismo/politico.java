/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_code.classe.polimorfismo;

/**
 *
 * @author Aluno
 */
public class politico extends pessoa {
    String partido;
    politico(int i, String n, String p){
        super(i, n);
        this.partido = p;
    }
    void mostrar(){
        System.out.println(nome + " é um político de " + idade + " anos de idade, filiado ao " + partido);
    }
}
