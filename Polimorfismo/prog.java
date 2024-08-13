package polimorfismo;

public class prog {
    public static void main(String[] args) {
        pessoa[]m = new pessoa[6];
        m[0] = new milico(23,"Juca","Cabo");
        m[1] = new politico(31, "João", "PMDB");
        m[2] = new milico(56,"Fernandinho","PTB");
        m[3] = new politico(69, "Josias", "PMD");
        m[4] = new professor(40, "Jubiscrelsom", "Matemática");
        m[5] = new professor(27, "Ana", "Biologia");

        m[0].mostrar();
        m[1].mostrar();
        m[2].mostrar();
        m[3].mostrar();
        m[4].mostrar();
        m[5].mostrar();
    }
}
