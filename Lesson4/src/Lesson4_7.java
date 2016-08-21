
public class Lesson4_7 {

    public static void main(String[] args) {

        int[] array = new int[100];

        int i = 0;
        int sequence = 1;

        while (i <= array.length - 1) {
            array[i] = sequence;
            sequence = sequence + 1;
            System.out.print(array[i] + ", ");
            i++;
        }

        int even = 0;
        int notEven = 0;
        i = 0;

        while (i <= array.length - 1) {
            if (array[i] % 2 != 0) {
                notEven = notEven + array[i];
            }
            if (array[i] % 2 == 0) {
                even = even + array[i];
            }
            i++;
        }
        System.out.println(" ");
        System.out.println("Sum of the not even elements of array - " + notEven);
        System.out.println("Sum of the even elements of the array - " + even);

    }

}
