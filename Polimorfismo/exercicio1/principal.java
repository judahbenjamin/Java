package exercicio1;

public class principal {
    public static void main (String[] args) {
        // pessoa p = new pessoa("Judah", 18, "172373722");
        // p.ImprimirDados();
        System.out.println("Informações do paciente:");

        pessoa paciente = new paciente("2243434", "SulBrasil", "Carlos",
        39, "32474374237");
        paciente.ImprimirDados();

        System.out.println("Informações do enfermeiro:");

        pessoa enfermeiro = new enfermeiro(12, "UTI",
        "1234567", "Ana Paula", 35, "326366237272");
        enfermeiro.ImprimirDados();
    }
}
