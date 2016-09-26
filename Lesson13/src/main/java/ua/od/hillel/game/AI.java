package ua.od.hillel.game;

import java.util.Random;

public class AI extends Player {

    public AI(String name, int age, char type) {
        super(name, age, type);
    }

    public String enterMove() {
        System.out.println("AI make turn...");
        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(3);
        return String.valueOf(i) + String.valueOf(j);
    }
}
