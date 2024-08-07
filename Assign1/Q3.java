package Assign1;

import java.util.Scanner;

// 3) Program in Java to find A+B, A-B, A*B and transpose of A, where A is a matrix of 3*3 and B is a
// matrix of 3*4.Take the values in matrixes A and B from the user.

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][4];

        System.out.println("enter element for arr1 ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter element for arr2 ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();
        mul(a, b);
    }

    public static void mul(int[3][3] arr, int[3][4] arr1) {

        int column = arr[0].length;
        int row = arr1.length;
        int mul[][] = new int[column][row];

        if (arr[0].length != arr1.length) {
            System.out.println("couldn't Multiply");
            return;
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                mul[i][j] = arr[i][j] * arr1[i][j];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mul[i][j] + "  ");
            }
            System.out.println();
        }
        
    }
}
