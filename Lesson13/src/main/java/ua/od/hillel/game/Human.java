package ua.od.hillel.game;

import java.util.Scanner;

public class Human extends Player {

    public Human(String name, int age, char type) {
        super(name, age, type);
    }

    public String enterMove() {
        Scanner scanner = new Scanner(System.in);
        return getMoveFromConsole(scanner);
    }

    public String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves...");
        System.out.print("Enter move from the board field: ");
        return scanner.next();
    }
}
