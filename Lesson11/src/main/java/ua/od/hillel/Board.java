package ua.od.hillel;

public class Board {

    public static final int BOARD_SIZE = 3;
    private char[][] board;

    Player playerFirst;
    Player playerSecond;

    Player currentPlayer;

    Player winner;

    public Board(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;

        this.currentPlayer = playerFirst;

        board = new char[BOARD_SIZE][BOARD_SIZE];
        fillBoard();
    }

    public boolean makeMove(String move) {
        if (!validateMove(move)) {
            return false;
        }

        int i = move.charAt(0) - '0';
        int j = move.charAt(1) - '0';

        if (board[i][j] != playerFirst.getType() && board[i][j] != playerSecond.getType()) {
            board[i][j] = currentPlayer.getType();
        } else {
            System.out.println("You can't change the value of this field, because it is not free. Turn passes to the next player.");
        }
        changePlayer();

        return true;
    }

    private void changePlayer() {
        if (currentPlayer == playerFirst) {
            currentPlayer = playerSecond;
        } else {
            currentPlayer = playerFirst;
        }
    }

    private boolean validateMove(String move) {
        return true;
    }

    private void findWinner() {
        //todo calculate player correctly
        winner = playerFirst;
    }

    public boolean gameFinished() {
        //todo finish the function
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            return true;
        }

        return false;
    }

    public void fillBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        //todo add symbols to show board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Player getWinner() {
        return winner;
    }
}
