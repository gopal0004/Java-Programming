package Assignment1;

// 4) Write and run a Java program to calculate factorial and the cube of the given integer number.
// Also find the sum and multiplication of its digits. Also
// check whether the no entered is palindrome or not.
public class Q4 {
    public static void factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1)
            System.out.println(n);
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("factorial of the number is " + fact);
    }

    public static void palindrome(int n) {
        int origin = n;
        int pln = 0;
        while (n > 0) {
            int digit = n % 10;
            pln = pln * 10 + digit;
            n /= 10;
        }
        System.out.println("Is the number a palindrome? " + (origin == pln));
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        factorial(n);
        palindrome(n);
    }
}