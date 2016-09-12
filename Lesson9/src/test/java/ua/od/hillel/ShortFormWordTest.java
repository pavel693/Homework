package ua.od.hillel;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShortFormWordTest {
    String sentence;

    @Before
    public void setUp() {
        sentence = "abc abcd abcde abcdef";
    }

    @Test
    public void sentenceToArray() {
        String[] expectedResult = {"abc", "abcd", "abcde", "abcdef"};
        assertThat(expectedResult, is(ShortFormWord.sentenceTOArray(sentence)));
    }

    @Test
    public void transformInShort() {
        String[] expectedResult = {"abc", "a2d", "a3e", "a4f"};
        assertThat(expectedResult, is(ShortFormWord.transformInShort(ShortFormWord.sentenceTOArray(sentence))));
    }

    @Test
    public void transformInShort2() {
        sentence = "internationalization localization cat elephant monitor";
        String[] expectedResult = {"i18n", "l10n", "cat", "e6t", "m5r"};
        assertThat(expectedResult, is(ShortFormWord.transformInShort(ShortFormWord.sentenceTOArray(sentence))));
    }
}
