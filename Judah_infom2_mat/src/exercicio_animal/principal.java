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
public class principal {
    public static void main (String[] args){
        cachorro cachorro = new cachorro("Alfredo","Domestico","Buldog",5);
        cachorro.dados_cachorro();
        
        gato gato = new gato("Melao","Domestico",4);
        gato.dados_gatos();
        gato.miar();
        
        dinossauro dino = new dinossauro("T-Rex","Selvagem","Carnívoro");
        dino.dados_dinossauro();
        dino.meteoro();
        
        animal animal = new animal("Jucreumson","Invertebrado");
        animal.dados();
    }
}
