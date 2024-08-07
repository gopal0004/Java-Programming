package Assign1;

import java.util.Scanner;

// 2. A method named average() has one argument that is an array of strings. It converts these
// to double values and returns their average. The method generates a NullPointerException
// if a array elements is null or NumberFormatException if an element is incorrectly
// formatted. Write a program that illustrates how to declare and use this method. Include
// throws clause in the method declaration to indicate that these problems can occur.

public class Ex2 {
    public double average(String[] arr) throws NumberFormatException {
        double[] arr1 = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new NullPointerException("String is null");
            }
            arr1[i] = Double.parseDouble(arr[i]);
        }

        double sum = 0;
        for (double d : arr1) {
            sum += d;
        }

        double average = sum / arr1.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();
        String[] arr = new String[size];

        System.out.println("enter elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        Ex2 e = new Ex2();
        System.out.println("average is : " + e.average(arr));
    }
}
