/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_arquivotxt;

/**
 *
 * Judah Benjamin - 19/08/24
 */
import java.io.*;
import java.util.*;
public class leitor2 {
    public static void main(String[]args){
        try{
            FileReader gravador = new FileReader("arquivo.txt");
            BufferedReader entrada = new BufferedReader(gravador);
            String linha;
            while((linha = entrada.readLine())!= null){
                StringTokenizer tok = new StringTokenizer(linha, ";");
                
                System.out.println("Bebida: " + tok.nextToken());
                System.out.println("Origem: " + tok.nextToken());
                System.out.println("Grau de alcool: " + tok.nextToken());
                System.out.println("-------------------------");
            }
        }
        catch(Exception e){
            System.out.println("Não deu para escrever o arquivo");
        }
    }
}
