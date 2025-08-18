package java_desafio_conta_corrente;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    // setando as propriedades
    int agencia;
    int conta;
    double saldo;
    String clientName;
    LocalDate date;
    boolean ativo = true;

    double consultarSaldo() {
        return saldo;
    }

    // aqui o certo é retornar um List mas tá dando um erro que na aula não aparece ainda pra corrigir
    void consultar(LocalDate dataInicial, LocalDate dataFinal) {
        // bloco de código que contém a logica do método
        return;
    };

    void sacar (double valorSolciitado) {
        // bloco de código que contém a lógica do método
    };

    void transferir (ContaCorrente contadestino, double valorSolicitado) {
        // bloco de código que contém a lógica do método
    };

    void cancelarConta(String justificativa) {
        // bloco de código que vai manipular o atributo global "ativo" que ficará como falso
    }
}
