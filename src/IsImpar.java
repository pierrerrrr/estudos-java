public class IsImpar {
    public static void isImpar( int number) {
        if(number % 2 == 0) {
            System.out.println("esse número é par");
        } else {
            System.out.println("esse número é impar");
        }
    }

    public static void main(String[] args) {
        isImpar(12);
    }
}
