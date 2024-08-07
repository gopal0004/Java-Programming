
// Write a program to enter the numbers till the user wants and at the end it should 
// display the count of positive, negative and zeros entered. 
import java.util.*;

public class Q3 {
    public static void Count(int n[]) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0) {
                zero++;
            } else if (n[i] < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        System.out.println("positive counts : " + positive);
        System.out.println("negative counts : " + negative);
        System.out.println("zero counts : " + zero);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of numbers ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Count(a);
        sc.close();
    }
}
