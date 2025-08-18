package java_05_tipo_wrappers;

public class TiposWrappers {
    public static void main(String[] args) {
        double numeroDouble = 123.56;
        int numeroIInt = (int) numeroDouble; // exemplo de conversão explicita
        System.out.println(numeroIInt);

        // utilizando tipo wrappers
        Double d = 100.56577;
        Integer i = d.intValue();
        System.out.println(i);
    }
}
