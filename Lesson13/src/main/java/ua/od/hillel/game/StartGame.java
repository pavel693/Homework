package ua.od.hillel.game;

public class StartGame {

    Board board;
    Player playerFirst;
    Player playerSecond;

    public void startGame(Board board, Player playerFirst, Player playerSecond) {
        while (!board.gameFinished()) {
            board.makeMove();
            board.printBoard();
        }
        Player player = board.getWinner();
        if (board.winner != null) {
            System.out.println("");
            System.out.println("Winner is " + player.getName() + " " + player.getAge());
        } else {
            System.out.println("");
            System.out.println("Dead Heat");
        }
    }
}
