package ua.od.hillel;

public class ShortFormWordMain {
    public static void main(String[] args) {
        String sentence = ShortFormWord.getScaner();
        String[] array = ShortFormWord.sentenceTOArray(sentence);
        array = ShortFormWord.transformInShort(array);
        ShortFormWord.printArray(array);
    }
}
