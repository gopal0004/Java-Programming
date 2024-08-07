package Assign1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// Write a program in Java to create variable size array. Data can be numeric.
//  Flush an array
//  add a number at a specified location in an array.
//  display the array

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = sc.nextInt();
        Number arr[] = new Number[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter position and element respectively to add");
        int pos = sc.nextInt();
        int val = sc.nextInt();
        if (pos < size) {
            arr[pos] = val;
            System.out.println("element " + val + " added successfully ");
        } else {
            System.out.println("Invalid position");
        }

        System.out.println("Elements of the array are ");
        for (Number n : arr) {
            System.out.print(n + " ");
        }
        sc.close();

    }
}
