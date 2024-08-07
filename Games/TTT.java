package Games;

import java.util.*;

public class TTT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = 3;
        int column = 3;
        char arr[][] = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = ' ';
            }
        }
        display(arr);

        for (int i = 0; i < row * column; i++) {
            int r, c;
            System.out.println("Player 1 enter position to enter O ");
            r = sc.nextInt();
            c = sc.nextInt();
            if (r < row && c < column && arr[r][c] == ' ') {
                arr[r][c] = 'O';
            } else {
                System.out.println("Invalid input or position already filled, re-enter position");
                i--;
                continue;
            }

            // Display the updated board
            display(arr);

            // Check if Player 1 has won
            if (winner(arr, 'O')) {
                System.out.println("Player 1 wins!");
                break;
            }

            // Player 2's turn
            System.out.println("Player 2 enter position to enter X ");
            r = sc.nextInt();
            c = sc.nextInt();
            if (r < row && c < column && arr[r][c] == ' ') {
                arr[r][c] = 'X';
            } else {
                System.out.println("Invalid input or position already filled, re-enter position");
                i--; // Decrement i to repeat Player 2's turn
                continue;
            }

            // Display the updated board
            display(arr);

            // Check if Player 2 has won
            if (winner(arr, 'X')) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }

    public static boolean winner(char arr[][], char c) {
        if ((arr[0][0] == c && arr[0][1] == c && arr[0][2] == c) ||
                (arr[1][0] == c && arr[1][1] == c && arr[1][2] == c) ||
                (arr[2][0] == c && arr[2][1] == c && arr[2][2] == c)) {
            return true;
        }

        if ((arr[0][0] == c && arr[1][0] == c && arr[2][0] == c) ||
                (arr[0][1] == c && arr[1][1] == c && arr[2][1] == c) ||
                (arr[0][2] == c && arr[1][2] == c && arr[2][2] == c)) {
            return true;
        }

        if ((arr[0][0] == c && arr[1][1] == c && arr[2][2] == c) ||
                (arr[0][2] == c && arr[1][1] == c && arr[2][0] == c)) {
            return true;
        }

        return false;
    }

    public static void display(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
