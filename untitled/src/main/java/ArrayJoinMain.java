import ua.od.hillel.ArrayJoin;

public class ArrayJoinMain {

    public static void main(String[] args) {

        int[] array1 = {2, 3, 5, 12, 15, 17, 20, 27};
        int[] array2 = {1, 4, 6, 7, 13, 16, 25};

        int[] arrayJoin = ArrayJoin.arayJoin(array1, array2);

        int[] arraySum = ArrayJoin.arraySort(arrayJoin);

        for (int i = 0; i < arraySum.length; i++) {
            System.out.print(arraySum[i] + ", ");
        }
    }
}
