package ua.od.hillel;

public class Dog {
    String breed;
    String name;
    String color;
    boolean sleep;
    boolean bark;

    Dog(String breed, String name, String color, boolean sleep, boolean bark) {
        this.breed = breed;
        this.name = name;
        this.sleep = sleep;
        this.bark = bark;

        if (color.equals("green") || color.equals("violet") || color.equals("purple")) {
            System.out.println("Are you kidding?");
            this.color = "null";
        } else {
            this.color = color;
        }
    }

    public void sleepYes() {
        sleep = true;
        System.out.println("The dog " + name + " is sleeping");
    }

    public void sleepNo() {
        sleep = false;
        System.out.println("The dog " + name + " is not sleeping");
    }

    public boolean isSleep() {
        return sleep;
    }

    public void barkYes() {
        if (sleep == true) {
            bark = false;
            System.out.println("The dog " + name + " is sleeping, it can't barking now");
        } else {
            bark = true;
            System.out.println("The dog " + name + " is barking now");
        }
    }

    public void barkNo() {
        bark = false;
    }

    public boolean isBark() {
        return bark;
    }
}