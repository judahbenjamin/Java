/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_animal;

/**
 *
 * Judah Benjamin
 * Data: 14/08/2024
 */
public class dinossauro extends animal {
    String tipo;
    dinossauro(String n, String c, String t){
        super(n , c);
        this.tipo = t;
    }
    void dados_dinossauro(){
        super.dados();
        System.out.println("Tipo: " + tipo);
    }
    
    void meteoro(){
        System.out.println("OLHA O METEOROOOO!!! CABUUUMMMMMM");
    }
}
