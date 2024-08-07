package ExceptionHandling;

public class prg1 {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int arr[] = new int[5];
        String str = null;
        try {
            j = 25 / i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled successfully..");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound ");
        } catch (Exception e) {
            System.out.println("something went wrong" + e);// exception handel all types of error
        }
        System.out.println(j);
    }
}
