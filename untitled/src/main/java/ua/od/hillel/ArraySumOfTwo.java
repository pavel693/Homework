package ua.od.hillel;

public class ArraySumOfTwo {
    public static boolean arraySumOfTwo(int[] array, int sum) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                return true;
            }
            if (array[i] + array[j] > sum){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
