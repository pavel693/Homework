package ua.od.hillel;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArraySumOfTwoTest {
    int[] array = {1, 2, 5, 8, 11, 15, 25, 47, 83};
    int sum;

    @Test
    public void arraySumOfTwo1() {
        int sum = 36;
        boolean result = ArraySumOfTwo.arraySumOfTwo(array, sum);
        assertThat(result, is(true));
    }

    @Test
    public void arraySumOfTwo2() {
        int sum = 151;
        boolean result = ArraySumOfTwo.arraySumOfTwo(array, sum);
        assertThat(result, is(false));
    }

    @Test
    public void arraySumOfTwo3() {
        int sum = 2;
        boolean result = ArraySumOfTwo.arraySumOfTwo(array, sum);
        assertThat(result, is(false));
    }
    @Test
    public void arraySumOfTwo4() {
        int sum = 18;
        boolean result = ArraySumOfTwo.arraySumOfTwo(array, sum);
        assertThat(result, is(false));
    }
}
