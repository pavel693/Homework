package ua.od.hillel.game;

import java.util.Date;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        boolean start;
        Player playerFirst = new AI("AI", 0, 'X');
        Player playerSecond = new Human("Mike", 35, 'O');
        Board board = new Board(playerFirst, playerSecond);

        do {
            BoardGame ticTacToe = new TicTacToe(board, playerFirst, playerSecond);
            ticTacToe.startGame();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to play one more time");
            if (scanner.nextLine().equals("yes")) {
                start = true;
                board = new Board(playerFirst, playerSecond);
            } else {
                start = false;
            }
        } while (start);

        GameResult result = new GameResult(board.getWinner(), new Date(), board.resultOfPlay());
        Statistics statistics = new Statistics();
        statistics.addResult(result);
        System.out.println(statistics.toString());
    }
}