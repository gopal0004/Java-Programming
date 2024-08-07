import java.util.*;

public class Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = sc.nextInt();
        System.out.println("enter number of columns ");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        System.out.println("enter values of row and columns");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }

        System.out.println("enter number to find it's index");
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == num) {
                    System.out.println("the index is : " + i + "," + j);
                }
            }
        }
    }
}
