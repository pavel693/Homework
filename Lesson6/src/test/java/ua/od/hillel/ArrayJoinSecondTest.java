package ua.od.hillel;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayJoinSecondTest {
    @Test
    public void arrayJoinSecondTest() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4};
        int[] expectedArray = {1, 2, 3, 4, 5, 7};
        int[] actualArray = ArrayJoinSecond.arraySort(ArrayJoinSecond.arayJoin(array1, array2));
        assertThat(actualArray, is(expectedArray));
    }
}
