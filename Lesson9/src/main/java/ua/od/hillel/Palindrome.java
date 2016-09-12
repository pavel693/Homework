package ua.od.hillel;

import java.util.Scanner;

public class Palindrome {

    public static String getScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text separated by comma");
        String words = scanner.nextLine();
        return words;
    }

    public static String[] wordsToArrayTrim(String words) {
        String[] wordsArray = words.split(",");
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = wordsArray[i].trim();
        }
        return wordsArray;
    }

    public static boolean isPalindrome(String word) {
        boolean palindrom = false;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                palindrom = false;
                break;
            }
            palindrom = true;
        }
        return palindrom;
    }

    public static int howManyPalindromsInArray(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPalindrome(array[i])) count++;
        }
        return count;
    }
}