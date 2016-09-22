package ua.od.hillel;

public class GeometricFiguresMain {
    public static void main(String[] args) {
        GeometricFigures triangle = new Triangle(3, 4, 5);
        GeometricFigures square = new Square(3);
        GeometricFigures rectangle = new Rectangle(3, 4);
        GeometricFigures geometricfigures[] = {triangle, square, rectangle};

        for (int i = 0; i < geometricfigures.length; i++) {
            geometricfigures[i].info();
            System.out.println();
        }
    }
}
