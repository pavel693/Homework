package ua.od.hillel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LanternTest2 {
    String name = "first";
    String colors = "red";
    int battery = 2;
    boolean shines = false;
    Lantern lantern1;

    @Before
    public void setUp() {
        lantern1 = new Lantern(name, colors, battery, shines);
    }

    @Test
    public void testLanternColors() {
        if (colors.equals("white") || colors.equals("red")) {
            assertEquals("Something is going wrong", colors, lantern1.colors);
        } else {
            assertEquals("Something is going wrong", "null", lantern1.colors);
        }
    }

    @Test
    public void testLanternBattery() {
        if (battery >= 1 && battery <= 3) {
            assertEquals("Something is going wrong", battery, lantern1.battery);
        } else {
            assertEquals("Something is going wrong", 0, lantern1.battery);
        }
    }

    @Test
    public void testLanternBlinking() {
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
