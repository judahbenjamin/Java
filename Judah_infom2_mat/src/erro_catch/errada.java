/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erro_catch;

/**
 *
 * @author Aluno
 */
public class errada {
    public static void main(String[] args){
        int[]x = new int[4];
        for(int c = 0; c < 10; c++){
            try {
                x[c] = c;
                System.out.println("A " + c + "° posição foi verificado.");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e + "° Tratado pelo catch");
            }
            finally{
                System.out.println("Fim da verificação.");
            }
        }
    }
}