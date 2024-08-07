import java.util.Scanner;

public class Q2 {
    public static void SumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum is : " + sum);
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter end range ");
        n = sc.nextInt();
        SumOfOdd(n);
        sc.close();
    }
}
