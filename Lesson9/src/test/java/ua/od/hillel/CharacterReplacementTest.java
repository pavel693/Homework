package ua.od.hillel;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CharacterReplacementTest {

    @Test
    public void characterReplacement1() {
        String email = "dog@gmail.com";
        String actualResult = CharacterReplacement.characterReplacement(email);
        assertThat(actualResult, is("dogatgmaildotcom"));
    }

    @Test
    public void characterReplacement2() {
        String email = "cat@meta.ua";
        String actualResult = CharacterReplacement.characterReplacement(email);
        assertThat(actualResult, is("catatmetadotua"));
    }
}
