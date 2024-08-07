import java.util.*;

public class FirstClass {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        a = sc.nextInt();
        System.out.println("enter second number : ");
        b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is : ");
        System.out.println(sum);

        // Close the Scanner when it's no longer needed (preferably in a finally block).
        sc.close();
    }
}
