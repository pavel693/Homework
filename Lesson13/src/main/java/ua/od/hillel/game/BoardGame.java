package ua.od.hillel.game;

public abstract class BoardGame {

    abstract boolean gameFinished();

    abstract boolean makeMove();

    abstract void printBoard();

    abstract Player getWinner();

    final void startGame() {
        while (!gameFinished()) {
            makeMove();
            printBoard();
        }
        Player player = getWinner();
        if (getWinner() != null) {
            System.out.println("");
            System.out.println("Winner is " + player.getName() + " " + player.getAge());
        } else {
            System.out.println("");
            System.out.println("Dead Heat");
        }
    }
}
