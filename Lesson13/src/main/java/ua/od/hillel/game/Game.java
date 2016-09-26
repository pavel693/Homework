package ua.od.hillel.game;

public class Game {

    public static void main(String[] args) {

        Player playerFirst = new AI("AI", 0, 'X');
        Player playerSecond = new Human("Mike", 35, 'O');

        Board board = new Board(playerFirst, playerSecond);

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