package Sobrepondometodos;

public class prin {
    public static void main(String[] args) {
        dragao dragao1 = new dragao();
        dragao1.falar();
        dragao dragao2 = new dragao(){
            void falar(){
                System.out.println("CUSPINDO FOGOOOOOO VRURURURURUR");
            }

        };
        dragao2.falar();
        dragao dragao3 = new dragao(){
            void falar(){
                System.out.println("AMIMIR");
            }
        };
        dragao3.falar();
    }
}