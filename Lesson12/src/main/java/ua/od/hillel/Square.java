package ua.od.hillel;

public class Square extends GeometricFigures {
    private int oneSide;

    Square(int oneSide) {
        this.oneSide = oneSide;
    }

    @Override
    public int perimeter() {
        return oneSide * 4;
    }

    @Override
    public double area() {
        return oneSide * oneSide;
    }

    @Override
    public String toString() {
        return "Square{" +
                "oneSide=" + oneSide +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
