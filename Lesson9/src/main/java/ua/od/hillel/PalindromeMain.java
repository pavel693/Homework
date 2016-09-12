package ua.od.hillel;

public class PalindromeMain {
    public static void main(String[] args) {
        String words = Palindrome.getScanner();
        String[] array = Palindrome.wordsToArrayTrim(words);
        int palindromCount = Palindrome.howManyPalindromsInArray(array);
        System.out.println("There are " + palindromCount + " palindrome in the text.");
    }
}
