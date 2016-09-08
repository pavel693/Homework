package ua.od.hillel;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DogTest {
    String breed = "labrador";
    String name = "little";
    String color = "black";
    boolean sleep = false;
    boolean bark = false;
    Dog dog;

    @Before
    public void setUp() {
        dog = new Dog(breed, name, color, sleep, bark);
    }

    @Test
    public void dogColorTest() {
        if (color.equals("green") || color.equals("violet") || color.equals("purple")) {
            assertThat(dog.color, is("null"));
        } else {
            assertThat(dog.color, is(color));
        }
    }

    @Test
    public void dogBarkYesTest() {
        if (sleep == false) {
            dog.barkYes();
            assertThat(dog.bark, is(true));
        } else {
            dog.barkYes();
            assertThat(dog.bark, is(false));
        }
    }
}
