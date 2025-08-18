package java_ex_01_semantica_sintaxe;

public class ContaApp {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 20.00;

        System.out.println(conta.saldo);
    }
}

// dentro de uma aplicação, recomenda-se que somente uma classe possua o méetodo main, responsavel por iniciar todo o
// nosso programa