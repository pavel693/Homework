package ua.od.hillel;

import org.junit.Test;

import static org.junit.Assert.*;

public class LanternTest {

    @Test
    public void testLanternColors() {
        String name = "first";
        String colors = "green";
        int battery = 1;
        boolean shines = false;
        Lantern lantern1 = new Lantern(name, colors, battery, shines);
        if (colors.equals("white") || colors.equals("red")) {
            assertEquals("Something is going wrong", colors, lantern1.colors);
        } else {
            assertEquals("Something is going wrong", "null", lantern1.colors);
        }
    }

    @Test
    public void testLanternBattery() {
        String name = "first";
        String colors = "red";
        int battery = 0;
        boolean shines = false;
        Lantern lantern1 = new Lantern(name, colors, battery, shines);
        if (battery >= 1 && battery <= 3) {
            assertEquals("Something is going wrong", battery, lantern1.battery);
        } else {
            assertEquals("Something is going wrong", 0, lantern1.battery);
        }
    }

    @Test
    public void testLanternBlinking() {
        String name = "first";
        String colors = "red";
        int battery = 0;
        boolean shines = false;
        Lantern lantern1 = new Lantern(name, colors, battery, shines);
        if (battery == 3) {
            boolean tru = true;
            lantern1.blinkOn();
            assertEquals("Something is going wrong, blinking don't work", tru, lantern1.shines);
        } else {
            boolean fal = false;
            lantern1.blinkOn();
            assertEquals("Something is going wrong", fal, lantern1.shines);
        }
    }
}
