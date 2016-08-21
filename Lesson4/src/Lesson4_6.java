

public class Lesson4_6 {

    public static void main(String[] args) {

        int[] array = new int[55];

        int i = 0;
        int sequence = 1;

        while (i <= 54) {
            array[i] = sequence;
            sequence = sequence + 2;
            System.out.print(array[i] + ", ");
            i++;
        }

        int max = array[0];
        int min = array[54];
        i = 0;

        while (i <= 54) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        System.out.println(" ");
        System.out.println("Minimal element in the array is - " + min);
        System.out.println("Maximum element in the array is - " + max);

    }
}
