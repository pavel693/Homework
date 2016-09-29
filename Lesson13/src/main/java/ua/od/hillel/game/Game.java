package ua.od.hillel.game;

public class Game {

    public static void main(String[] args) {

        Player playerFirst = new AI("AI", 0, 'X');
        Player playerSecond = new Human("Mike", 35, 'O');

        Board board = new Board(playerFirst, playerSecond);
        StartGame game = new StartGame();

        game.startGame(board, playerFirst, playerSecond);

    }
}