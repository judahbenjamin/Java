package modificador1;

public class classeB {
   public static void main(String[] args) {
        // classeA cA = new classeA();

        // System.out.println(cA.senha);

        classeA classeA = new classeA();

        classeA.falar(); //O private não pode ser acessado por ninguém
   } 
}
