package ExceptionHandling;

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

public class Custom {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println(arr[0]);
        try {
            if (arr[0] < 1) {
                throw new MyException("ha moj ha");
            }
        } catch (MyException e) {
            System.out.println("default output" + e);
        }
    }
}
