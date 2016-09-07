package ua.od.hillel;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CarTest {
    String model = "toyota";
    String make = "corolla";
    String type = "passenger";
    int numberOfSeats = 4;
    int numberOfPassengers = 3;
    boolean start = false;
    Car car;

    @Before
    public void setUp() {
        car = new Car(model, make, type, numberOfSeats, numberOfPassengers, start);
    }

    @Test
    public void carTestType() {
        if (type.equals("passenger")) {
            assertThat(car.type, is("passenger"));
        } else {
            assertThat(car.type, is("null"));
        }
    }

    @Test
    public void carTestSeats() {
        if (numberOfSeats > 0 && numberOfSeats < 8) {
            assertThat(car.numberOfSeats, is(4));
        } else {
            assertThat(car.numberOfSeats, is(0));
        }
    }

    @Test
    public void carTestPassengers() {
        if (numberOfPassengers <= numberOfSeats) {
            assertThat(car.numberOfPassengers, is(3));
        } else {
            assertThat(car.numberOfPassengers, is(0));
        }
    }

    @Test
    public void carTestStart() {
        boolean tru = true;
        boolean fal = false;
        car.startOn();
        if (numberOfPassengers == 0) {
            assertThat(car.start, is(fal));
        } else {
            assertThat(car.start, is(tru));
        }
    }
}
