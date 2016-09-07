package ua.od.hillel;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArraySumOfTwoTest {
    @Test
    public void arraySumOfTwoTestTrue() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 9;
        String expectedResult = "true - because sum of 4 and 5 is 9";
        String actualResult = ArraySumOfTwo.arraySumOfTwo(array, sum);
        assertThat(actualResult, is(expectedResult));
    }

    @Test
    public void arraySumOfTwoTestFalse() {
        int[] array = {1, 5, 9, 12, 16, 19, 28, 50, 60};
        int sum = 100;
        String expectedResult = "false - because there are no numbers that can give in sum - " + sum;
        String actualResult = ArraySumOfTwo.arraySumOfTwo(array, sum);
        assertThat(actualResult, is(expectedResult));
    }
}
