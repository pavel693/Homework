package ua.od.hillel;

public class Square extends GeometricFigures {
    private int oneSide;

    Square(int oneSide) {
        this.oneSide = oneSide;
    }

    public int perimeter() {
        return oneSide * 4;
    }

    public int area() {
        return oneSide * oneSide;
    }

    @Override
    public void info() {
        System.out.println("Perimeter of square is: " + perimeter());
        System.out.println("Area of square is: " + area());
    }
}
