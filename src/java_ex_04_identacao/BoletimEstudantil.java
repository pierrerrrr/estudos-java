package java_ex_04_identacao;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 4;
        if(mediaFinal<6) {
            System.out.println("REPROVADO");
        } else if(mediaFinal==6) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println(("APROVADO"));
        }
    }
}
