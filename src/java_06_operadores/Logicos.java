package java_06_operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        if (1 == 1 && 2 > 3 || 4 < 5 )
            System.out.println("nesse caso essa lógica é true - quando || só uma operação precisa ser verdadeira");
    }
}
