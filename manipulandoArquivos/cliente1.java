package manipulandoArquivos;

import java.io.*;


public class cliente1 {
    public static void main(String[] args) {
        try{
            FileWriter criar = new FileWriter("nomes.txt");
            BufferedWriter saida = new BufferedWriter(criar);

            saida.write("Joao Pereira Dos Santos;\n");
            saida.write("Manoel Gonçalves Junior;\n");
            saida.write("Ana Maria Silva;\n");
            saida.write("Joana Maria Pereira;\n");
            saida.write("Rebeca Cruz Santos;\n");
            saida.flush();
        }
        catch(Exception e){
            System.out.println("Deu Pau!");
        }
    }
}
