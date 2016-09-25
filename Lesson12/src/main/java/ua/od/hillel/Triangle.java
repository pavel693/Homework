package ua.od.hillel;

public class Triangle extends GeometricFigures {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public int perimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double area() {
        double semiperimeter = perimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - firstSide) * (semiperimeter - secondSide) * (semiperimeter - thirdSide));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
