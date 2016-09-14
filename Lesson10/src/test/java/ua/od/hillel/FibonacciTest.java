package ua.od.hillel;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciTest {
    Fibonacci fibonacci;
    int number;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci(number);
    }

    @Test
    public void numberFibonacciTest() {
        number = 15;
        int actualResult = fibonacci.numberFibonacci(number);
        assertThat(actualResult, is(610));
    }

    @Test
    public void numberFibonacciRecursTest() {
        number = 10;
        int actualResult = fibonacci.numberFibonacciRecurs(number);
        assertThat(actualResult, is(55));
    }

    @Test
    public void factorialTest() {
        number = 5;
        int actualResult = fibonacci.factorial(number);
        assertThat(actualResult, is(120));
    }
}
