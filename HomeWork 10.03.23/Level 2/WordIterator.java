package HomeWork10_03_23;

import java.util.Iterator;

public class WordIterator implements Iterator<Character> {
    private int currentIndex;
    private String word;
    public WordIterator(String word) {
        this.word = word;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < word.length();
    }

    @Override
    public Character next() {
        return word.charAt(currentIndex++);
    }
}
