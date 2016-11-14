package com.kharchenkoPavel.ticTacToe;

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

    @Override
    public String toString() {
        return name + " " + age + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (age != player.age) return false;
        if (type != player.type) return false;
        return name != null ? name.equals(player.name) : player.name == null;

    }
}