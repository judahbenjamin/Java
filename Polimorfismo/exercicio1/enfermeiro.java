package exercicio1;

public class enfermeiro extends pessoa {
    
    int horaTrabalho;
    String setor;
    String numeroCadastro;

    enfermeiro(int horaTrabalho, String setor, String numeroCadastro, 
    String nome, int idade, String documento){
        super(nome, idade, documento);
        this.horaTrabalho = horaTrabalho;
        this.setor = setor;
        this.numeroCadastro = numeroCadastro;
    }

    void ImprimirDados(){
        super.ImprimirDados();
        System.out.println("Hora de trabalho: " + this.horaTrabalho);
        System.out.println("Setor: " + this.setor);
        System.out.println("Numero de cadastro: " + this.numeroCadastro);
    }
}
