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
            changePlayer();
        } else {
            System.out.println("You have last chance to do a right turn, you should choose free field on the board");
        }
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
        if (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            if (playerFirst.getType() == board[0][0]) {
                winner = playerFirst;
            } else {
                winner = playerSecond;
            }
        }
        if (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            if (playerFirst.getType() == board[1][0]) {
                winner = playerFirst;
            } else {
                winner = playerSecond;
            }
        }
        if (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            if (playerFirst.getType() == board[2][0]) {
                winner = playerFirst;
            } else {
                winner = playerSecond;
            }
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (playerFirst.getType() == board[0][0]) {
                winner = playerFirst;
            } else {
                winner = playerSecond;
            }
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (playerFirst.getType() == board[0][2]) {
                winner = playerFirst;
            } else {
                winner = playerSecond;
            }
        }
    }

    public boolean gameFinished() {
        if (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            return true;
        }
        if (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            return true;
        }
        if (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            return true;
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
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
        for (int i = 0; i < 3; i++) {
            if (i > 0) {
                System.out.println("---------");
            }
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    System.out.print(board[i][j] + " | ");
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }

    public Player getWinner() {
        findWinner();
        return winner;
    }
}