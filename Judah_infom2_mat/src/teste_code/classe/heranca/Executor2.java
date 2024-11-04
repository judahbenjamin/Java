/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_code.classe.heranca;

/**
 *
 * Judah Benjamin
 * Data: 08/08/24
 */
public class Executor2 {
    public static void main(String[] args){
        Carro c1 = new Carro("Uno",2005,"B");
        Carro c2 = new Carro("Gol",2001,"C");
        Tanque t1 = new Tanque("Sherman",1942,20);
        Tanque t2 = new Tanque("Merkava",1977,20);
        
        c1.dados_carro();
        c2.dados_carro();
        System.out.println(t1.dados_tanque());
        System.out.println(t2.dados_tanque());
    }
}
