package ua.od.hillel;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player playerFirst = new Player("Bob", 25, 'X');
        Player playerSecond = new Player("Mike", 35, 'O');

        Board board = new Board(playerFirst, playerSecond);

        while (!board.gameFinished()) {
            String move = getMoveFromConsole(scanner);
            board.makeMove(move);
            board.printBoard();
        }

        Player player = board.getWinner();
        System.out.println(player.getName() + " " + player.getAge());
    }

    private static String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves...");
        System.out.print("Enter move: ");
        return scanner.next();
    }
}
