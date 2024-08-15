package exercicio2;

/**
 * serie
 */
public class serie {
    String nome;
    int temporadas;
    int ano;
    serie(String nome, int temporadas, int ano){
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }

    // String ImprimindoDados(){
    //     return "Nome: " + nome + "\nTemporada(s): " + temporadas + "\nAno: " + ano;
    // }
    
    void ImprimindoDados(){
        System.out.println("Nome: " + nome + "\nTemporada(s): " + temporadas + "\nAno: " + ano);
    }
}