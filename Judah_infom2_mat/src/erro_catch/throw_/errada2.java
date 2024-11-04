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
public class errada2 {
    void rodar() throws ArrayIndexOutOfBoundsException{
        int[]x = new int[4];
        for(int c = 0; c < 10; c++){
            x[c] = c;
            System.out.println(c + "° verificado pelo Try");
            /*
            Throw - é o responsável por obrigar uma classe para tratar o erro com 
            um Try e um Catch. Ele informa os erros às classes que instanciou o objeto.
            
            A diferença do Throw pelo Try Catch é que o Throw informa o erro à classe responsável
            e o Try Catch buscar tentar tratar esse erro específico.
            */
        }
    }
}
