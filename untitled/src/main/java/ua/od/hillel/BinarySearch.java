package ua.od.hillel;

public class BinarySearch {

    int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int numberInArray(int[] array, int number) {
        int start = 0;
        int mid = 0;
        int end = array.length;

        for (start = 0; start < end; ) {
            mid = (start + end) / 2;
            if (array[mid] == number) {
                return mid;
            }
            if (array[mid] < number) {
                start = mid;
            }
            if (array[mid] > number) {
                end = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 11};
        BinarySearch binarySearch = new BinarySearch(array);
        int result = binarySearch.numberInArray(array, 2);
        System.out.println(result);
    }
}
