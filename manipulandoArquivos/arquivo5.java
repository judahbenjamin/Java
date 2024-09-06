package manipulandoArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class arquivo5 {
    public static void main(String[] args) {
        try{
            FileReader gravar = new FileReader("dados.txt");
            BufferedReader saida = new BufferedReader(gravar);

            String line;
            while ((line = saida.readLine())!= null) {
                
                StringTokenizer tok = new StringTokenizer(line,";");

                System.out.println("Nome:" + tok.nextToken());
                System.out.println("Idade:" + tok.nextToken());
                System.out.println("Nacionalidade:" + tok.nextToken());
                
            }
        }catch(Exception e){
            System.out.println("DEU PAU!");
        }
    }
}
