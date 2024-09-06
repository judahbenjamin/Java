package manipulandoArquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class arquivo4 {
    public static void main(String[] args) {
        try{
            FileReader gravar = new FileReader("Dados_cliente.txt");
            BufferedReader saida = new BufferedReader(gravar);

            String line;
            while ((line = saida.readLine())!=null) {
                System.out.println(line);
            }
        } catch(Exception e){
            System.out.println("DEU RUIM!");
        }
        
    }
}
