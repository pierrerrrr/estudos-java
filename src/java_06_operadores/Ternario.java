package java_06_operadores;

public class Ternario {
    public static void main(String[] args) {
        String name = "rebeca";
        int idade = 9;
        final int MAIOR_IDADE = 18;
        boolean eDeMaior = idade >= MAIOR_IDADE;

        // utilizando operadores ternários
        String menssagem = name + (eDeMaior ? " é de maior" : " não é de maior");
        System.out.println(menssagem);

        // agora do modo clássico
        if(idade >= MAIOR_IDADE)
            System.out.println(name + " é de maior");
        else
            System.out.println(name + " é de menor");
    }
}
