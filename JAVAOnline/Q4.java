
// Two numbers are entered by the user, x and n. Write a function 
// to find the value of one number raised to the power of another i.e. xn.
import java.util.*;

public class Q4 {
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base ");
        int x = sc.nextInt();
        System.out.println("enter exponent");
        int n = sc.nextInt();
        System.out.println("power is : " + power(x, n));
        sc.close();
    }
}
