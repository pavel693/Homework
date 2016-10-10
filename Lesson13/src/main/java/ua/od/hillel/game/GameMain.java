package ua.od.hillel.game;

import java.util.Date;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        boolean start;
        Player playerFirst = new AI("AI", 0, 'X');
        Player playerSecond = new Human("Mike", 35, 'O');
        Board board = new Board(playerFirst, playerSecond);
        Statistics statistics = new Statistics();

        do {
            BoardGame ticTacToe = new TicTacToe(board, playerFirst, playerSecond);
            ticTacToe.startGame();
            GameResult result = new GameResult(board.getWinner(), new Date(), board.resultOfPlay());
            statistics.addResult(result);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to play one more time");
            if (scanner.nextLine().equals("yes")) {
                start = true;
                board = new Board(playerFirst, playerSecond);
            } else {
                start = false;
            }
        } while (start);
        System.out.println(statistics);
    }
}