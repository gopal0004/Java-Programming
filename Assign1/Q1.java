// 1) Write application that creates an array of double, to provide following functionality.
//  display the length of the array and its elements.
//  Display an array. (Use for each version of loop for display).
//  compute the sum of the squares of these numbers.
//  Determine Mean and Median of an array.
//  Sort an array – Ascending and Descending. Use any two sorting algorithm. User can also
// select the sorting method.
//  Search an element from the array, i.e. returns the location of the element of an array
// that matches an indicated value.
//  Copy of an array.
//  Reverse of an array.

package Assign1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        size = sc.nextInt();

        double arr[] = new double[size];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("Size is : " + arr.length);
        System.out.println("Elements of the array are  ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("for each");
        for (double d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();

        // calculating sum of the squares
        double square = 0;
        double sum = 0;
        double total = 0;
        for (double d : arr) {
            total += d;
            square = d * d;
            sum += square;
            square = 0;
        }
        System.out.println("The sum of the squares are : " + sum);

        System.out.println("sorted array using Bubble sort ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (double d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("sorted array using Insertion sort");
        for (int i = 1; i < size; i++) {
            double current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for (double d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("arr in descending order or reverse array ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("mean is : " + (total / size));

        if (size % 2 == 0) {
            int x = size / 2 - 1;
            System.out.println("median of the array is : " + (arr[x] + arr[x + 1]) / 2.0);
        } else {
            int x = size / 2;
            System.out.println("median of the array is : " + arr[x]);
        }

        System.out.println("enter element you want to search");
        double val = sc.nextDouble();
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                System.out.println("element " + val + " is found at index " + i);
                return;
            }
        }
        sc.close();
    }
}
