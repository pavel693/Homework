import ua.od.hillel.ArrayJoin;

public class ArrayJoinMain {

    public static void main(String[] args) {

        int[] array1 = {2, 3, 5, 7, 12, 15, 17, 20, 27};
        int[] array2 = {1, 4, 6, 7, 13, 16, 25, 30, 31, 35, 37};

        int[] arrayJoin = ArrayJoin.arayJoin(array1, array2);

        int[] arrayJoinSort = ArrayJoin.arraySort(arrayJoin);

        ArrayJoin.printArray(arrayJoinSort);
        System.out.println("");
        System.out.println(arrayJoinSort.length);
    }
}
