package manipulandoArquivos;

import java.io.*;
import java.util.*;

public class clientetest {
    public static void main(String[] args) {
        try{
            FileReader ler1 = new FileReader("Emails.txt");
            BufferedReader sair1 = new BufferedReader(ler1);
            FileReader ler2 = new FileReader("nomes.txt");
            BufferedReader sair2 = new BufferedReader(ler2);
            
            String line1;
            while ((line1 = sair1.readLine())!= null) {
                StringTokenizer tok2 = new StringTokenizer(line1,";"); 

                /*
                 * Agora, eu estou pegando a linha de texto que havia sido capturada na variável “linha” e estou
                   quebrando ela em pedaços, usando o ponto-e-vírgula como sinal de quebra. Logo abaixo, eu vou usar o
                   método “nextToken()” para fazer o meu sistema percorrer todos os tokens que existem nesta linha de
                   texto.
                 */

                System.out.println("Nome: " + tok2.nextToken());
            }
            
            System.out.println();

            String line2;
            while((line2 = sair2.readLine())!=null){
                StringTokenizer tok = new StringTokenizer(line2,";");

                System.out.println("Email: " + tok.nextToken());
            }
        }
        catch(Exception e){
            System.out.println("Deu bosta!");
        }
    }
}
