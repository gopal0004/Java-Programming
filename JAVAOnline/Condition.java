import java.util.*;

public class Condition {
    public static void main(String args[]) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        num1 = sc.nextInt();
        System.out.println("enter second number : ");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("both number are same ");
        } else if (num1 > num2) {
            System.out.println("first number is greater ");
        } else {
            System.out.println("second number is greater ");
        }
        sc.close();
    }
}
