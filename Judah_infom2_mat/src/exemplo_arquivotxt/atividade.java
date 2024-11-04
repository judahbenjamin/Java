/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_arquivotxt;

/**
 *
 * 
 */

import java.io.*;
import java.util.*;
public class atividade {
    public static void main(String[]args){
        try{
            FileReader gravador = new FileReader("testando2.txt");
            BufferedReader entrada = new BufferedReader(gravador);
            
            String linha;
            while((linha = entrada.readLine())!= null){
                StringTokenizer tok = new StringTokenizer(linha, "*");
                
                System.out.println("            Declaração          ");
                System.out.println("");
                System.out.printf("o senhor(a) " + tok.nextToken());
                System.out.printf(", residente em: " + tok.nextToken());
                System.out.printf(", " + tok.nextToken());
                System.out.printf("," + tok.nextToken());
                System.out.println(", com CEP: " + tok.nextToken());
                System.out.println(" está apto para realizar a maratona de programação, devido a seu cadastro que foi analisado, ser aprovado.");
                System.out.println("Vila Velha, 21 de agosto de 2024.");
                System.out.println("=============================================");
                
            }
        }
        catch(Exception e){
            System.out.println("Não deu para escrever o arquivo");
        }
    }
}
