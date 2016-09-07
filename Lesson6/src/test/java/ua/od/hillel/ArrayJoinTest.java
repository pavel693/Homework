package ua.od.hillel;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayJoinTest {

    @Test
    public void arrayJoinTest1() {

        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7};
        int[] actualArray = ArrayJoin.arraySort(ArrayJoin.arrayJoin(array1, array2));
        assertThat(actualArray, is(expectedArray));
    }

    @Test
    public void arrayJoinTest2() {
        int[] array1 = {2, 3, 5, 7, 12, 15, 17, 20, 27};
        int[] array2 = {1, 4, 6, 7, 13, 16, 25, 30, 31, 35, 37};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 7, 12, 13, 15, 16, 17, 20, 25, 27, 30, 31, 35, 37};
        int[] actualArray = ArrayJoin.arraySort(ArrayJoin.arrayJoin(array1, array2));
        assertThat(actualArray, is(expectedArray));
    }
}