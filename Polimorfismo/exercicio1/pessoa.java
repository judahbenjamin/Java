package exercicio1;

public class pessoa {
    String nome;
    int idade;
    String documento;
    pessoa(String nome,int idade,String documento){
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    void ImprimirDados(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nDocumento: " + documento);
    }
}
