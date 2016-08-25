
public class Lesson5_2 {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        int counter = 1;

        for (int j = 0; j < array.length; j++) {
            int i = 0;
            array[i][j] = counter;
            counter++;
        }
        for (int i = 1; i < array.length; i++) {
            int j = 3;
            array[i][j] = counter;
            counter++;
        }
        for (int j = 2; j >= 0; j--) {
            int i = 3;
            array[i][j] = counter;
            counter++;
        }
        for (int i = 2; i > 0; i--) {
            int j = 0;
            array[i][j] = counter;
            counter++;
        }
        for (int j = 1; j < 3; j++) {
            int i=1;
            array[i][j]=counter;
            counter++;
        }
        for (int j=2; j>0; j--) {
            int i=2;
            array[i][j]=counter;
            counter++;
        }
        System.out.println(array[1][1]);
        System.out.println(array[2][2]);
        System.out.println(array[2][1]);
    }
}
