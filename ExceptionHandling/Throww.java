package ExceptionHandling;

public class Throww {
    public static void main(String[] args) {
        int i = 25;
        int j = 0;

        try {
            j = 20 / i; // creating error
            if (j == 0) {
                throw new ArithmeticException("na thai ala ");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception thrown: " + e);
            System.out.println("hii");
        }
    }
}
