package ua.od.hillel;

public class ArraySumOfTwo {

    public static String arraySumOfTwo(int[] array, int sum) {

        String tru = "true -";
        String newTru = "";
        String fal = "false - because there are no numbers that can give in sum - " + sum;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    newTru = tru + " because sum of " + array[i] + " and " + array[j] + " is " + sum;
                }
            }
        }
        if (newTru.length() > tru.length()) {
            return newTru;
        } else {
            return fal;
        }
    }
}