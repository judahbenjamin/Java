/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_arquivotxt;

/**
 *
 * Judah Benjamin - 19/08/24
 * 
 */
import java.io.*;
public class escritor {
    public static void main (String[]args){
        try{
            FileWriter gravador = new FileWriter("arquivo.txt");
            BufferedWriter saida = new BufferedWriter(gravador);
            saida.write("Olá, Mundo \n");
            saida.write("Viva o jogo dos canibais");
            saida.flush();
        }
        catch(IOException e){
            System.out.println("Não deu para escrever o arquivo");
        }       
    }
}
