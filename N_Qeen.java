package BrackTracking;

import java.util.Scanner;

public class N_Queen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNqueen(n);
    }

    static void printNqueen(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nqueen(board, 0);
    }

    static void nqueen(char[][] board, int i) {

        if (i == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int j = 0; j< board.length; j++) {

            if (isSafe_placeQueen(board, i, j)) {

                board[i][j] = 'Q';     // Place Queen

                nqueen(board, i + 1);    // Recurse

                board[i][j] = '.';     // Backtrack
            }
        }
    }

    static boolean isSafe_placeQueen(char[][] board, int row, int col) {

        // Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Upper Left Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Upper Right Diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static void printBoard(char[][] board) {
        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}