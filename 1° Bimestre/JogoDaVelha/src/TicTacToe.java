import java.util.Scanner;

public class TicTacToe {

    static int count = 0;
    private static char[][] board = new char[3][3];

    private static char currentPlayer = 'X';

    public static void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public static void placeMark(int row, int col) {
        board[row][col] = currentPlayer;
    }

    public static boolean isGameOver() {
        count++;
        if (checkRows() || checkColumns() || checkDiagonals()) {
            printBoard();
            switchPlayer();
            System.out.println(currentPlayer + "'s wins!");
            return (true);
        } else if(count >= 10){
            System.out.println("Draw.");
            return (true);
        }
        else {
            return false;
        }
    }


    private static boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }