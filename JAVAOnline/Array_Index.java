import java.util.*;

public class Array_Index {
    public static void main(String args[]) {
        int size;
        System.out.println("enter size of the array ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int[] n = new int[size];
        System.out.println("enter elements ");
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }

        System.out.println("enter number to find its index ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < n.length; i++) {
            if (n[i] == num) {
                System.out.println("the number is found at index " + i);
                return;
            }
        }
        System.out.println("number not found");
    }
}