package ua.od.hillel;

import java.util.Scanner;

public class ShortFormWord {

    public static String getScaner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the words separated by space");
        String words = scanner.nextLine();
        return words;
    }

    public static String[] sentenceTOArray(String words) {
        String[] arrayWords = words.split(" ");
        return arrayWords;
    }

    public static String[] transformInShort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= 4) {
                int numberCutCharacters = array[i].length() - 2;
                int lastElement = array[i].length() - 1;
                array[i] = array[i].charAt(0) + String.valueOf(numberCutCharacters) + array[i].charAt(lastElement);
            }
        }
        return array;
    }

    public static void printArray(String[] array) {
        for (String word : array) {
            System.out.print(word + " ");
        }
    }
}
