/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_code.classe.heranca;

/**
 *
 * Judah Benjamin
 * Data: 07/08/2024
 */
public class Carro extends veiculo { //Extends - Herda tud
    String categoria;
    Carro(String m, int a, String cat){
        super(m,a); //rodar o método construtor da superclasse
        this.categoria = cat;
    }
    
    void dados_carro(){
        System.out.println("Modelo: " + this.modelo + " | Ano de fabricação: " + this.ano_fabricacao + " | Categoria: " + this.categoria);
    }
}
