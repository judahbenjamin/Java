package manipulandoArquivos;

import java.io.*;

public class arquivo2 {
    public static void main(String[] args) {
        try{
            FileReader gravador = new FileReader("TestandoArq.txt");
            BufferedReader entrada = new BufferedReader(gravador);

            String linha;
            while ((linha = entrada.readLine()) != null) {
                System.out.println(linha);
            }
        }
        catch(Exception e){
            System.out.println("Não deu para ler o arquivo");
        }
    }
}
