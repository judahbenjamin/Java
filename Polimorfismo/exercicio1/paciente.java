package exercicio1;

public class paciente extends pessoa{
    String matricula;
    String planoDeSaude;

    paciente(String matricula, String planoDeSaude,String nome,int idade,String documento){
        super(nome, idade, documento);
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;
    }
    void ImprimirDados(){
        super.ImprimirDados();
        System.out.println("Matricula: " + matricula + "\nPlano de saúde: " + planoDeSaude);
    }
}
