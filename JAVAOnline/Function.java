import java.util.*;

public class Function {
    public static void Fectorial(int n) {
        if (n < 0) {
            System.out.println("invalid number");
        } else if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            int fect = 1;
            for (int i = n; i >= 1; i--) {
                fect = fect * i;
            }
            System.out.println("fectorial of " + n + " is " + fect);
            return;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        Fectorial(n);
        sc.close();
    }
}