/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_algoritmos;

/**
 *
 * Judah Benjamin - 21/08
 */

//2 – Faça um programa que leia o nome, idade e sexo de várias pessoas até que o nome
//digitado seja “FIM” e informe:
//a) O nome e a idade da pessoa mais velha;
//b) O nome e a idade da pessoa mais nova;
//c) Quantas pessoas eram do sexo masculino;
//d) Quantas pessoas eram do sexo feminino; e
//e) A quantidade de pessoas digitadas e a média de idade.

import java.util.Scanner;

public class quest_2 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        
        String nome;
        String sexo;
        int idade;
        int maior_idade = 0;
        int menor_idade = 0;
        int contador = 0;
        int quant_masc = 0;
        int quant_fem = 0;
        int tot_idade = 0;
        String nome_velho = " ";
        String nome_novo = " ";
        boolean continuar = true;
        
        while(continuar = true){
            System.out.printf("Informe o nome da pessoa: ");   
            nome = ler.next();
        
            if(nome.equals("FIM")){
                continuar = false;
                break;
            }
            
            System.out.printf("Informe a idade da pessoa: ");
            idade = ler.nextInt();
        
            System.out.printf("Informe o sexo da pessoa: ");
            sexo = ler.next();
            
            if (contador == 0){
                maior_idade = idade;
                nome_velho = nome;
                menor_idade = idade;
                nome_novo = nome;
            }

            if (idade > maior_idade){
                maior_idade = idade;
                nome_velho = nome;
            }
        
            if (idade < menor_idade){
                menor_idade = idade;
                nome_novo = nome;
            }
        
            if (sexo.equals("M")){
                quant_masc += 1;
            }
            else{
                quant_fem += 1;
            }
        
            tot_idade += idade;
            contador += 1;
        }
        int media = tot_idade/contador;
        System.out.println();
        System.out.println("A pessoa mais velha é " + nome_velho + " e tem " + maior_idade + " anos.");
        System.out.println("A pessoa mais nova é " + nome_novo + " e tem " + menor_idade + " anos.");
        System.out.println("Quantidade de pessoas do sexo masculino: " + quant_masc);
        System.out.println("Quantidade de pessoas do sexo feminino: " + quant_fem);
        System.out.println("Quantidade de pessoas digitadas foram " + contador + " com média de " + media + " de idade.");
                
        System.out.println("PROGRAMA FINALIZADO...");
    }
}
