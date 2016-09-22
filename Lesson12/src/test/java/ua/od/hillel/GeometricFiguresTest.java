package ua.od.hillel;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeometricFiguresTest {

    @Test
    public void TrianglePerimeterTest() {
        Triangle triangle = new Triangle(2, 3, 4);
        assertThat(triangle.perimeter(), is(9));
    }

    @Test
    public void TriangleAreaTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertThat(triangle.area(), is(6.0));
    }

    @Test
    public void SquarePerimeterTest() {
        Square square = new Square(4);
        assertThat(square.perimeter(), is(16));
    }

    @Test
    public void SquareAreaTest() {
        Square square = new Square(5);
        assertThat(square.area(), is(25));
    }

    @Test
    public void RectanglePerimeterTest() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertThat(rectangle.perimeter(), is(18));
    }

    @Test
    public void RectangleAreaTest() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertThat(rectangle.area(), is(12));
    }

}
