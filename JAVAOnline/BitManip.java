import java.util.*;

public class BitManip {
    // get operation
    public static void get(int n, int pos) {
        int bitmask = 1 << pos;

        if ((bitmask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }

    public static void set(int n, int pos) {
        int bitmask = 1 << pos;
        int newNumber = bitmask | n;
        System.out.println("new number is : " + newNumber);
    }

    public static void clear(int n, int pos) {
        int bitmask = 1 << pos;
        bitmask = ~bitmask;
        int newNumber = bitmask & n;
        System.out.println("clear : " + newNumber);
    }

    public static void update(int n, int pos) {
        System.out.println("enter choice to update 0/1 ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();

        if (choice == 1) {
            int bitmask = 1 << pos;
            int newNumber = bitmask | n;
            System.out.println("set 1 successfully,new number is : " + newNumber);
        } else if (choice == 0) {
            int bitmask = 1 << pos;
            bitmask = ~bitmask;
            int newNumber = bitmask & n;
            System.out.println(" 0 set successfully,new number is : " + newNumber);
        }
    }

    public static void main(String args[]) {
        get(5, 2);
        set(5, 1);
        clear(5, 2);
        update(5, 1);
    }
}
