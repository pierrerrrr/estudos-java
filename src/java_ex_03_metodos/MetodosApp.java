package java_ex_03_metodos;

public class MetodosApp {
    // essa é a estrutura de um metodo
    public static int sum (int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {
        int result = sum(24, 32);
        System.out.println("O resultado da soma é: " + result);
    }
}
