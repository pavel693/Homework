package ua.od.hillel;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PalindromeTest {

    @Test
    public void wordsToArrayTest() {
        String words = "deleveled, evitative, cat, dog, deified";
        String[] expectedResult = {"deleveled", "evitative", "cat", "dog", "deified"};
        String[] actualResult = Palindrome.wordsToArrayTrim(words);
        assertThat(actualResult, is(expectedResult));
    }

    @Test
    public void isPalindromeTest() {
        String word = "dogagod";
        assertThat(Palindrome.isPalindrome(word), is(true));
    }

    @Test
    public void howManyPalindromsInArrayTest() {
        String[] array = {"deleveled", "evitative", "cat", "dog", "deified"};
        int actualResult = Palindrome.howManyPalindromsInArray(array);
        assertThat(actualResult, is(3));
    }
}
