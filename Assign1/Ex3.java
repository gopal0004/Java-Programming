package Assign1;

import java.util.Scanner;

// 3. Write a program which creates an Array of character. Make one function with one
// argument as a character and that function throw a user defined exception if the character
// that u have passed is digit.

class DigitFoundException extends Exception {
    String str = "DigitFoundException";

    @Override
    public String toString() {
        return str;
    }
}

public class Ex3 {

    public static void check(char c) {
        try {
            if (Character.isDigit(c)) {
                throw new DigitFoundException();
            }
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the character array");
        int size = sc.nextInt();

        char[] arr = new char[size];
        System.out.println("enter characters  ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("hi");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        check('9');
    }
}
