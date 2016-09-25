package ua.od.hillel;

public class GeometricFiguresMain {
    public static void main(String[] args) {
        GeometricFigures triangle = new Triangle(3, 4, 5);
        GeometricFigures square = new Square(3);
        GeometricFigures rectangle = new Rectangle(3, 4);
        GeometricFigures geometricFiguresArray[] = {triangle, square, rectangle};

        for (GeometricFigures geometricFigures : geometricFiguresArray) {
            System.out.println(geometricFigures.perimeter());
            System.out.println(geometricFigures.area());
            System.out.println();
        }
        for (GeometricFigures geometricFigures : geometricFiguresArray) {
            System.out.println(geometricFigures.toString());
        }
    }
}
