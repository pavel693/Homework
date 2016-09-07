package ua.od.hillel;

public class ArrayJoinSecond {
    public static int[] arayJoin(int[] array1, int[] array2) {

        int[] arrayJoin = new int[array1.length + array2.length];
        int counter = 0;

        for (int i = 0; i < array1.length; i++) {
            arrayJoin[i] = array1[i];
            counter = i;
        }
        counter++;
        for (int i = 0; i < array2.length; i++) {
            arrayJoin[counter] = array2[i];
            counter++;
        }

        return arrayJoin;
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
}
