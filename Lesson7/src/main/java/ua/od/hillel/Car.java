package ua.od.hillel;

public class Car {
    String model;
    String make;
    String type;
    int numberOfSeats;
    int numberOfPassengers;
    boolean start;

    Car(String model, String make, String type, int numberOfSeats, int numberOfPassengers, boolean start) {
        this.model = model;
        this.make = make;
        this.start = start;

        if (type.equals("passenger")) {
            this.type = type;
        } else {
            this.type = "null";
            System.out.println("You can use only passenger car");
        }
        if (numberOfSeats > 0 && numberOfSeats < 8) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = 0;
            System.out.println("The passenger car must have more than 0 seats, but less then 8");
        }
        if (numberOfPassengers <= numberOfSeats) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            this.numberOfPassengers = 0;
            System.out.println("Number of passengers must be less than or equal number of seats");
        }
    }

    public void startOn() {
        if (numberOfPassengers > 0) {
            start = true;
        } else {
            System.out.println("Car can't start without passengers");
        }
    }

    public void startOff() {
        start = false;
    }
}
