package polimorfismo;

public class milico extends pessoa {
    String patente;
    milico(int i,String n,String p){
        super(i, n);
        this.patente = p;
    }
    void mostrar(){
        System.out.println(nome + " é um " + patente + " cuja idade é " + idade + " anos");
    }
}
