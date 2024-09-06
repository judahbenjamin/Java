package manipulandoArquivos;

import java.io.*;

public class cliente2 {
    public static void main(String[] args) {
        try{
            FileWriter g = new FileWriter("Emails.txt");
            BufferedWriter s = new BufferedWriter(g);

            s.write("joaopereira@gmail.com\n");
            s.write("goncalvesmanoel@hotmail.com\n");
            s.write("anamariasilva@email.com\n");
            s.write("joanam@hotmail.com\n");
            s.write("rebecacruz@gmail.com\n");
            s.flush();
        }
        catch(Exception e){
            System.out.println("Programa burro");
        }
    }
}
