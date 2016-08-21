
public class Lesson4_9 {

    public static void main(String[] args) {

        int number = 123;
        int[] array = new int[100];
        int i = 0;

        while (number > 0) {

            if (number % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            number /= 2;
            System.out.print(array[i]);
            i++;
        }

        System.out.println("");

        while (i >= 1) {
            i--;
            System.out.print(array[i]);
        }
    }
}
