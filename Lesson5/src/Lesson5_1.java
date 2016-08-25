

public class Lesson5_1 {

    public static void main(String[] args) {

        int[][] array = new int[12][12];
        int firstElement = 1;
        int i = 0;
        int j = 0;

        for (i = 0; i <= j && i < array.length; i++) {
            for (j = 0; j <= i && j < array.length; j++) {
                array[i][j] = Lesson5_1.binomialCoefficient(i, j);
            }
        }
        System.out.println(array[9][4]);
        System.out.println(array[10][5]);
        System.out.println(array[11][6]);
    }

    public static int factorial(int a) {
        int factorial = 1;
        if (a == 0) {
            return 1;
        }
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int binomialCoefficient(int i, int j) {
        int binomCoeff = (Lesson5_1.factorial(i)) / (Lesson5_1.factorial(j) * Lesson5_1.factorial(i - j));
        return binomCoeff;
    }

}
