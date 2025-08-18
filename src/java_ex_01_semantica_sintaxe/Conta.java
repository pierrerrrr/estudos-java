package java_ex_01_semantica_sintaxe;

public class Conta {
    // variavel da classe conta
    double saldo = 10.0;

    public void sacar(Double valor) {
        // variavel do metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        // disponivel pra toda classe
        System.out.println(saldo);
        // somente o metodo sacar conhece essa variavel
        // System.out.println(novoSaldo);
    }
}
