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
public class principal {
    public static void main(String[] args){
        pessoa[]m = new pessoa[6];
        m[0] = new politico(50,"Joao","PMDF");
        m[1] = new milico(27,"Jonas","Cabo");
        m[2] = new politico(45,"Leoncio","PRT");
        m[3] = new milico(35,"Marcelo","Sargento");
        m[4] = new professor(29,"Luis","Geografia");
        m[5] = new professor(24,"Maria","Portugues");
        
        m[0].mostrar();
        m[1].mostrar();
        m[2].mostrar();
        m[3].mostrar();
        m[4].mostrar();
        m[5].mostrar();
    }
}
