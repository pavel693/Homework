package ua.od.hillel;

public class ArrayJoin {
    public static int[] arayJoin(int[] array1, int[] array2) {

        int[] arraySum = new int[array1.length + array2.length];
        int counter = 0;

        if (array1.length < array2.length) {
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
        }
        if (array2.length < array1.length) {
            for (int i = 0; i < array2.length; i++) {
                if (array2[i] < array1[i]) {
                    arraySum[i + i] = array2[i];
                    arraySum[i + i + 1] = array1[i];
                } else {
                    arraySum[i + i] = array1[i];
                    arraySum[i + i + 1] = array2[i];
                }
                counter++;
            }
            for (int i = counter; i < array1.length; i++) {
                arraySum[i + array2.length] = array1[i];
            }
        }
        int i = 0;
        while (i < arraySum.length - 1) {
            if (arraySum[i] > arraySum[i + 1]) {
                int temp = arraySum[i];
                arraySum[i] = arraySum[i + 1];
                arraySum[i + 1] = temp;
                i = 0;
            }
            i++;
        }
        return arraySum;
    }
}
