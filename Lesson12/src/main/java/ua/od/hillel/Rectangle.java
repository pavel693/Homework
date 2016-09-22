package ua.od.hillel;

public class Rectangle extends GeometricFigures {
    private int firstSide;
    private int secondSide;

    Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int perimeter() {
        return (firstSide + secondSide) * 2;
    }

    public int area() {
        return firstSide * secondSide;
    }

    @Override
    public void info() {
        System.out.println("Perimeter of rectangle is: " + perimeter());
        System.out.println("Area of rectangle is: " + area());
    }
}
