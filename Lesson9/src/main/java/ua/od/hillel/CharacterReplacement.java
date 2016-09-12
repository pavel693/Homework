package ua.od.hillel;

public class CharacterReplacement {

    public static String characterReplacement(String word) {
        String newWord = word.replace("@", "at");
        newWord = newWord.replace(".", "dot");
        return newWord;
    }
}
