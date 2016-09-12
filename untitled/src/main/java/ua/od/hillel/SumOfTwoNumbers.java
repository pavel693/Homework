package ua.od.hillel;

import ua.od.hillel.ArraySumOfTwo;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9, 12};
        int sum = 12;
        boolean result = ArraySumOfTwo.arraySumOfTwo(array, sum);
        System.out.println(result);
    }
}
