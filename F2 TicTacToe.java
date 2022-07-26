import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // create the array board.

        char[][] board = {
                { '_', '_', '_' },
                { '_', '_', '_' },
                { '_', '_', '_' }
        };
        printBoard(board);

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("\nTurn: X");
                int[] userMarkIndex = askUser(board);
                board[userMarkIndex[0]][userMarkIndex[1]] = 'X';

            } else {
                System.out.println("\nTurn: O");
                int[] userMarkIndex = askUser(board);
                board[userMarkIndex[0]][userMarkIndex[1]] = 'O';
            }
            printBoard(board);
            checkWinner(board);
        }
    }

    // print the board.
    public static void printBoard(char[][] boardBox) {
        System.out.println("\n");
        for (int i = 0; i < boardBox.length; i++) {
            for (int j = 0; j < boardBox.length; j++) {
                System.out.print(boardBox[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // askuser to input
    public static int[] askUser(char[][] board) {
        System.out.print("\t~ Pick a row and column number: ");
        int row = scan.nextInt();
        int column = scan.nextInt();
        while (board[row][column] != '_') {
            System.out.print("\t~ Position already taken, try again: ");
            row = scan.nextInt();
            column = scan.nextInt();
        }
        return new int[] { row, column }; // cheat sheat trick.
    }

    // check the winner
    private static void checkWinner(char[][] board) {
        int count = 0;
        // linear row check:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                System.out.println(count > 0 ? "X Wins!.. Congrats X !!!" : "O Wins!.. Congrats O !!!");
                System.exit(0);
            } else {
                count = 0; // reset the value
            }
        }

        // linear column check
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                System.out.println(count > 0 ? "X Wins!.. Congrats X !!!" : "O Wins!.. Congrats O !!!");
                System.exit(0);
            } else {
                count = 0; // reset the value
            }
        }

        // corner 1
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count++;
            } else if (board[i][i] == 'O') {
                count--;
            }

        }
        if (count == 3 || count == -3) {
            System.out.println(count > 0 ? "X Wins!.. Congrats X !!!" : "O Wins!.. Congrats O !!!");
            System.exit(0);
        } else {
            count = 0; // reset the value
        }

        // corner 2
        for (int i = 0; i < board.length; i++) {
            int rowIndex = 2 - i;
            if (board[rowIndex][i] == 'X') {
                count++;
            } else if (board[rowIndex][i] == 'O') {
                count--;
            }
        }
        if (count == 3 || count == -3) {
            System.out.println(count > 0 ? "X Wins!.. Congrats X !!!" : "O Wins!.. Congrats O !!!");
            System.exit(0);
        } else {
            count = 0; // reset the value
        }

    }
}
