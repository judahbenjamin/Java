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
public class veiculo {
    //Os atributos
       String modelo;
       int ano_fabricacao;
       String estado_funcionamento;
       
       //metodo construtor
       veiculo(String m, int a){
           this.modelo = m;
           this.ano_fabricacao = a;
           this.estado_funcionamento = "Perfeito";
       }
       
       //metodo vazio
       void levar_tiro(){
           this.estado_funcionamento = "Estragado";
       }
       
       
       
}
