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
public class pessoaExec {
    public static void main(String[] args){
        Pessoa x = new Pessoa("João",25,60);
        Pessoa x2 = new Pessoa("Jorge",30,90);
        Pessoa x3 = new Pessoa("Lucas",20,70);
        Pessoa x4 = new Pessoa("Ana",23,72);
        
        System.out.println(x.dados());
        System.out.println(x2.dados());
        System.out.println(x3.dados());
        System.out.println(x4.dados());
        
        x.aniversario();
        x2.aniversario();
        x3.aniversario();
        x4.aniversario();
        
        System.out.println(x.dados());
        System.out.println(x.peso());
        System.out.println(x2.dados());
        System.out.println(x2.peso());
        System.out.println(x3.dados());
        System.out.println(x3.peso());
        System.out.println(x4.dados());
        System.out.println(x4.peso());
    }
}
