/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_code.classe.polimorfismo;

/**
 *
 * Judah Benjamin
 * Data: 14/08/2024
 */
public class professor extends pessoa{
    String disciplina;
    professor(int i, String n, String d){
        super(i, n);
        this.disciplina = d;
    }
    void mostrar(){
        System.out.println(nome + " é professor(a) de " + disciplina + " e sua idade é " + idade + " anos!");
    }
}
