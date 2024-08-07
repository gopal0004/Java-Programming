import java.util.*;

public class Question {
    public static void main(String args[]) {
        // printing the table of number given by user
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to get it's table : ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
        sc.close();
    }
}