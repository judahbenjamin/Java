/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erro_catch.throw_;

import erro_catch.*;

/**
 *
 * @author Aluno
 */
public class progerrado {
    public static void main (String[]args){
        errada2 x = new errada2();
        System.out.println("Try");
        try{
            x.rodar();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Deu erro");
        }
    }
}
