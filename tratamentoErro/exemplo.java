package tratamentoErro;

import java.util.*;

public class exemplo {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");
        carros.add("UNO");
        carros.add("GOL");
        carros.add("CAMARO");
        carros.add("FERRARI");

        // System.out.println(carros.get(0));

        try{
            System.out.println(carros.get(10));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("ERRO: valor fora do índice do array");
        }
        finally{
            System.out.println("Fim do try");
        }
    }
}
