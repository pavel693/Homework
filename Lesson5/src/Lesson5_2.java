
public class Lesson5_2 {
    public static void main(String[] args) {

        int SIZE = 10;
        int[][] array = new int[SIZE][SIZE];
        int counter = 1;

        int width = SIZE - 1;
        int hight = SIZE - 1;

        int reverse = 0;
        int i = 0;
        int j = 0;

        while (counter < SIZE * SIZE) {
            while (j < width) {
                array[i][j] = counter++;
                j++;
            }
            while (i < hight) {
                array[i][j] = counter++;
                i++;
            }
            while (j > reverse) {
                array[i][j] = counter++;
                j--;
            }
            width--;
            hight--;
            reverse++;
            while (i > reverse) {
                array[i][j] = counter++;
                i--;
            }
        }
        if (counter == SIZE * SIZE) {
            array[i][j] = counter++;
        }
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                System.out.print("\t" + array[x][y]);
            }
            System.out.println();
        }
    }
}
