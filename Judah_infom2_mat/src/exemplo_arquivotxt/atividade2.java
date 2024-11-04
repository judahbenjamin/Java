/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_arquivotxt;

/**
 *
 * @author Aluno
 */
import java.io.*;
public class atividade2 {
    public static void main(String[]args){
        try{
            FileWriter gravador = new FileWriter("testando2.txt");
            BufferedWriter saida = new BufferedWriter(gravador);
            saida.write("Marcos*Vitoria*Vila Velha*ES*13232333");
            saida.flush();
        }
        catch(IOException e){
            System.out.println("Deu erro");
        }
    }
}
