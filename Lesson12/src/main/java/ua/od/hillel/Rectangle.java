package ua.od.hillel;

public class Rectangle extends GeometricFigures {
    private int firstSide;
    private int secondSide;

    Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public int perimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
