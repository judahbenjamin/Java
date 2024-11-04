/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_code.classe.heranca;

/**
 *
 * Judah Benjamin
 * Data: 07/08/2024
 */
public class Tanque extends veiculo{
    int calibre_canhao;
    Tanque(String m, int a, int cal){
        super(m,a);
        this.calibre_canhao = cal;
    }
    void levar_tiro(){
        this.estado_funcionamento = "Meio avariado";
        System.out.println("Nem doeu Bro!");
    }
    
    String dados_tanque(){
        return "Modelo: " + this.modelo + " | Ano de fabricação: " + this.ano_fabricacao + " | Calibre: " + this.calibre_canhao;
    }
}
