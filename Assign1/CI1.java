package Assign1;

import java.util.Scanner;

// 1. Write a class called Statistics, which has a static method called average, which takes a one
// dimensional array for double type, as parameter, and prints the average for the values in the
// array.
// a. Now write a class with the main method, which creates a two-dimensional array for the
// four weeks of a month, containing minimum temperatures for the days of the week(an
// array of 4 by 7), and uses the average method of the Statistics class to compute and
// print the average temperatures for the four weeks.

class Statistic {
    public static void average(double[] arr) {
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        System.out.println("Average of the array is : " + (sum / arr.length));
    }

    public static void average(double[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr1[i].length; j++) {
                sum += arr1[i][j];
            }
            double weeklyA = (sum / arr1[i].length);
            System.out.println("Average for week " + i + 1 + " is : " + weeklyA);
        }
    }
}

public class CI1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the 1-D array");
        int size = sc.nextInt();
        double[] arr = new double[size];

        System.out.println("enter element for 1-D");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        Statistic.average(arr);

        double[][] arr1 = new double[4][7];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                arr1[i][j] = sc.nextDouble();
            }
        }
        Statistic.average(arr1);
    }
}
