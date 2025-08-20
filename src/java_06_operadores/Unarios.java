package java_06_operadores;

public class Unarios {
    public static void main(String[] args) {
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        int numero2 = 5;
        numero2++;

        System.out.println(++numero2);

        boolean verdadeira = true;

        boolean falsa = !verdadeira;

        System.out.println(falsa);
    }
}
