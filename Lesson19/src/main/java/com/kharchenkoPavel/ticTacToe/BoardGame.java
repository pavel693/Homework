package com.kharchenkoPavel.ticTacToe;

public abstract class BoardGame {

    abstract boolean gameFinished();

    abstract char makeMove(int finalI, int finalJ);

    abstract void printBoard();

    abstract String getWinner();

}

