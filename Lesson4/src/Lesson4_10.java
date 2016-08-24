
public class Lesson4_10 {

    public static void main(String[] args) {

        int[] array = {12, 42, 98, 57, 35, 94, 34, 87, 31, 8, 21, 64, 16, 28};
        int i = 0;
        int min1 = array[0];
        int min2 = array[1];
        int min3 = array[2];
        int min4 = array[3];
        int min5 = array[4];

        while (i < array.length) {
            if (min1 > array[i]) {
                min1 = array[i];
            }
            i++;
        }
        System.out.println("First minimal element of array is - " + min1);

        i = 0;
        while (i < array.length) {
            if (min2 > array[i] && array[i] != min1) {
                min2 = array[i];
            }
            i++;
        }
        System.out.println("Second minimal element of array is - " + min2);

        i = 0;
        while (i < array.length) {
            if (min3 > array[i] && array[i] != min1 && array[i] != min2) {
                min3 = array[i];
            }
            i++;
        }
        System.out.println("Third minimal element of array is - " + min3);

        i = 0;
        while (i < array.length) {
            if (min4 > array[i] && array[i] != min1 && array[i] != min2 && array[i] != min3) {
                min4 = array[i];
            }
            i++;
        }
        System.out.println("Fourth minimal element of array is - " + min4);

        i = 0;
        while (i < array.length) {
            if (min5 > array[i] && array[i] != min1 && array[i] != min2 && array[i] != min3 && array[i] != min4) {
                min5 = array[i];
            }
            i++;
        }
        System.out.println("Fifth minimal element of array is - " + min5);
    }
}
