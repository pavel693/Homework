

public class Lesson4_5 {

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

        int sumSequence = 0;
        int n = 0;

        while (n < 10) {
            sumSequence = sumSequence + array[n];
            n++;
        }
        System.out.println(" ");
        System.out.println("Sum of first 10 elements of the array - " + sumSequence);
    }
}
