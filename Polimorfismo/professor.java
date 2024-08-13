package polimorfismo;

public class professor extends pessoa{
    String disciplina;
    professor(int i, String n, String d){
        super(i, n);
        this.disciplina = d;
    }
    void mostrar(){
        System.out.println(nome + " é professor(a) de " + disciplina + " e sua idade é " + idade + " anos");
    }
}
