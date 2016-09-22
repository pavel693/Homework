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

    public int perimeter() {
        return firstSide + secondSide + thirdSide;
    }

    public double area() {
        double semiperimeter = perimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - firstSide) * (semiperimeter - secondSide) * (semiperimeter - thirdSide));
    }

    @Override
    public void info() {
        System.out.println("Perimeter of triangle is: " + perimeter());
        System.out.println("Area of triangle is: " + area());
    }
}
