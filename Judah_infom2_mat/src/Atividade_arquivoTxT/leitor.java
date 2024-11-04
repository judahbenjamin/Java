/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_arquivoTxT;

/**
 *
 * Judah Benjamin - 22/08/24
 */

import java.io.*;
import java.util.ArrayList;
        
public class leitor {
    public static void main(String[]args){
        try{
            FileReader gravador = new FileReader("exercicio.txt");
            BufferedReader entrada = new BufferedReader(gravador);
            
            String linha;
            while((linha = entrada.readLine())!=null){
                System.out.println(linha);
            }
        }
        catch(IOException e){
            System.out.println("Deu erro");
        }
    }
}
