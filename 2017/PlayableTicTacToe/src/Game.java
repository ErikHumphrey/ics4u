/**
 * TTT class
 */

public class Game {
    private String[][] board;
    private String player1, player2;

    /**
     * constructor
     * pre: none
     * post: board has been initialized. player1 is X and player 2 is O.
     */

    public Game() {
        player1 = "X";
        player2 = "O";
        board = new String[3][3];
        for (int row = 0; row < board.length; row++)
            for (int col = 0; col < board[0].length; col++)
                board[row][col] = " ";
    }

    /**
     * Plays a game of tic-tac-toe with two users, keeping tracking of player turns. player1 goes first.
     * pre: none
     * post: a game of tic-tac-toe has been played
     */
    public void play() {
        String currPlayer = player1;
        int movesMade = 0;

        do {
            displayBoard();
            makeMove(currPlayer);
            movesMade += 1;
            if (currPlayer == player1) currPlayer = player2;
            else currPlayer = player1;
        }
        while (movesMade <= 9 && winner() == " ");
        displayBoard();
        System.out.println("Winner is " + winner());
    }

    /**
     * Displays the board.
     * pre: none
     * post: The tic-tac-toe bboard has been displayed.
     */
    private void displayBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++)
                System.out.print("[" + board[row][col] + "]");
            System.out.println();
        }
    }

    /**
     * Prompt user for a move until a valid move has been made.
     * pre: none
     * post: A mark has been made in an empty tic-tac-toe board square.
     */
    private void makeMove(String player) {
        @SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
        boolean validMove = false;
        int row, col;

        do {
            System.out.print("Enter row number (0, 1, 2): ");
            row = input.nextInt();
            System.out.print("Enter column number (0, 1, 2): ");
            col = input.nextInt();
            if ((row >= 0 && row < board.length &&
                    col >= 0 && col < board[0].length) && board[row][col].equals(" ")) {
                board[row][col] = player;
                validMove = true;
            } else
                System.out.println("Invalid move. Try again.");
        }
        while (!validMove);
    }

    /**
     * Determine winner. Return " " if no winner.
     * pre: none
     * post: X, O, or " " has been returned as the winner.
     */
    private String winner() {
        /* Test rows */
        for (int row = 0; row < board.length; row++)
            if (board[row][0].equals(board[row][1]) &&
                board[row][1].equals(board[row][2]) &&
                !(board[row][0].equals(" ")))
                return (board[row][0]);

        /* Test columns */
        for (int col = 0; col < board[0].length; col++)
            if (board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col]) && !(board[0][col].equals(" ")))
                return (board[0][col]);

        // Test diagonal
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !(board[0][0].equals(" ")))
            return board[0][0];

        // Test other diagonal
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !(board[0][2].equals(" ")))
            return board[0][2];

        return (" ");
    }
}