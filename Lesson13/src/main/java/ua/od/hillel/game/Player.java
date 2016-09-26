package ua.od.hillel.game;

abstract class Player {

    private String name;
    private int age;
    private char type;

    public Player(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String enterMove();
}
