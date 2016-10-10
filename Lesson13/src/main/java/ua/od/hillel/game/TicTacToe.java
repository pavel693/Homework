package ua.od.hillel.game;

public class TicTacToe extends BoardGame {

    private Board board;
    private Player playerFirst;
    private Player playerSecond;

    public TicTacToe(Board board, Player playerFirst, Player playerSecond) {
        this.board = board;
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    boolean gameFinished() {
        return board.gameFinished();
    }

    boolean makeMove() {
        return board.makeMove();
    }

    void printBoard() {
        board.printBoard();
    }

    Player getWinner() {
        return board.getWinner();
    }
}
