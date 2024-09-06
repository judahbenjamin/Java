package manipulandoArquivos;

import java.io.*;

public class arquivo1 {
    public static void main(String[] args) {
        try{
            FileWriter gravador = new FileWriter("TestandoArq.txt");
            BufferedWriter saida = new BufferedWriter(gravador);

            saida.write("Testando, testando, testando...\n");
            saida.write("Isso é um arquivo de texto\n");
            saida.write("Outra linha...\n");
            saida.write("kakakakskasksksksksksksksksksksksk");
            saida.flush();
        }
        catch(IOException e){
            System.out.println("Não deu para escrever o arquivo");
        }
    }
}

