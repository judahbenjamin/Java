package manipulandoArquivos;

import java.io.*;
import java.util.*;

public class pessoa {
    public static void main(String[] args) {
        try{
            FileReader gravar = new FileReader("pessoas.txt");
            BufferedReader saida = new BufferedReader(gravar);

            String l;
            while ((l = saida.readLine())!=null) {
                StringTokenizer t = new StringTokenizer(l,";");

                System.out.println("Nome: " + t.nextToken());
                System.out.println("Idade: " + t.nextToken());
                System.out.println("===========================");
            }
        }
        catch(Exception e){
            System.out.println("Não funcionou a leitura do arquivo");
        }
    }
}
