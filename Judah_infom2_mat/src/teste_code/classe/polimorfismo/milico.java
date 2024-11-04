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
public class milico extends pessoa {
    String patente;
    milico(int i, String n, String p){
        super(i, n);
        this.patente = p; 
    }
    void mostrar(){
        System.out.println(nome + " é um " + patente + " cuja idade é " + idade + " anos");
    }
}
