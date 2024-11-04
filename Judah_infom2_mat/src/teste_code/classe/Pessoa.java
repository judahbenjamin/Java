/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_code.classe;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    String nome;
    int idade;
    float peso;
    
    Pessoa(String n, int i, float p){
        this.nome = n;
        this.idade = i;
        this.peso = p;
  
    }
    
    void aniversario(){
        this.idade++;
    }
    
    String peso(){
        return this.nome + " tem " + this.peso + " quilos ";
    }
    
    String dados(){
        return this.nome + " tem " + this.idade + " anos.";
   
    }
    
}
