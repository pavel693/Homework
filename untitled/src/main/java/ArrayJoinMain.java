import ua.od.hillel.ArrayJoin;

public class ArrayJoinMain {

    public static void main(String[] args) {

        int[] array1 = {2, 4, 8, 9, 12, 15, 17, 20, 25, 27};
        int[] array2 = {1, 3, 5, 6, 7, 13, 17, 20};

        int[] arraySum = ArrayJoin.arayJoin(array1, array2);

        for(int i=0; i<arraySum.length; i++) {
            System.out.print(arraySum[i] + ", ");
        }
    }
}
