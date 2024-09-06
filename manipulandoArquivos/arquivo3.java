package manipulandoArquivos;

import java.io.*;

public class arquivo3 {
    public static void main(String[] args) {
        try{
            FileWriter gravar = new FileWriter("Dados_cliente.txt");
            BufferedWriter saida = new BufferedWriter(gravar);

            saida.write("Jubiscreumson Ferrari Da Silva\n");
            saida.write("35 anos\n");
            saida.write("jubiscreumsonferrari@gmail.com\n");
            saida.write("9999-9999\n");
            saida.write("218.987.156-90");
            saida.flush();
        } catch(Exception e){
            System.out.println("DEU RUIM!");
        }
    }
}
