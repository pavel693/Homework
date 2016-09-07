package ua.od.hillel;

public class Lantern {
    String name;
    String colors;
    int battery;
    boolean shines;

    Lantern(String name, String colors, int battery, boolean shines) {
        this.name = name;
        this.shines = shines;

        if (battery == 0 || battery > 3) {
            System.out.println("For use the lantern, you need 1-3 batteries");
            this.battery = 0;
        } else {
            this.battery = battery;
        }
        if (colors.equals("white") || colors.equals("red")) {
            this.colors = colors;
        } else {
            this.colors = "null";
            System.out.println("This color is not available, you can choose from white or red");
        }
    }

    public void blinkOn() {
        if (battery == 3) {
            shines = true;
            System.out.println("The lantern " + name + " is blinking by " + colors);
        } else {
            System.out.println("This lantern " + name + " can't blinking");
        }
    }

    public void blinkOff() {
        shines = false;
    }

    public void switchOn() {
        shines = true;
    }

    public void switchOff() {
        shines = false;
    }

    public boolean isShines() {
        return shines;
    }
}
