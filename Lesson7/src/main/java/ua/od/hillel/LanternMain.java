package ua.od.hillel;

public class LanternMain {
    public static void main(String[] args) {

        Lantern lantern1 = new Lantern("first", "white", 3, false);
        lantern1.blinkOn();

        Lantern lantern2 = new Lantern("second", "red", 2, false);
        lantern2.blinkOn();

    }
}
