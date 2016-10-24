package com.kharchenkoPavel.ticTacToe;

public class TicTacToe extends BoardGame {

    private Board board;
    private Player playerFirst;
    private Player playerSecond;

    public TicTacToe(Board board, Player playerFirst, Player playerSecond) {
        this.board = board;
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    @Override
    boolean gameFinished() {
        return board.gameFinished();
    }

    char makeMove(int i, int j) {
        return board.makeMove(i, j);
    }

    void printBoard() {
        board.printBoard();
    }

    String getWinner() {
        return board.getWinner();
    }
}

