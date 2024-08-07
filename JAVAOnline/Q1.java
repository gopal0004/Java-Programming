import java.util.Scanner;

public class Q1 {
    public static int Average(int x, int y, int z) {
        int sum;
        sum = x + y + z;
        return sum / 3;
    }

    public static void main(String args[]) {
        System.out.println("enter three numbers to get its average ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("the average is ");
        System.out.println(Average(x, y, z));
        sc.close();
    }
}
