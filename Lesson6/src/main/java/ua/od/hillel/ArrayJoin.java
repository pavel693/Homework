package ua.od.hillel;

public class ArrayJoin {
    public static int[] arrayJoin(int[] array1, int[] array2) {

        int[] arrayJoin = new int[array1.length + array2.length];

        if (array1.length <= array2.length) {
            arrayJoin = arraySum(array1, array2);
        }
        if (array2.length < array1.length) {
            arrayJoin = arraySum(array2, array1);
        }
        return arrayJoin;
    }

    static int[] arraySum(int[] array1, int[] array2) {
        int[] arraySum = new int[array1.length + array2.length];
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < array2[i]) {
                arraySum[i + i] = array1[i];
                arraySum[i + i + 1] = array2[i];
            } else {
                arraySum[i + i] = array2[i];
                arraySum[i + i + 1] = array1[i];
            }
            counter++;
        }
        for (int i = counter; i < array2.length; i++) {
            arraySum[i + array1.length] = array2[i];
        }
        return arraySum;
    }

    public static int[] arraySort(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
            } else {
                i++;
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}