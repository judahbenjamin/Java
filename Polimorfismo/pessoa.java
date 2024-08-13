package polimorfismo;

abstract class pessoa{
    int idade;
    String nome;
    pessoa(int i,String n){
        this.idade = i;
        this.nome = n;
    }
    abstract void mostrar();
}