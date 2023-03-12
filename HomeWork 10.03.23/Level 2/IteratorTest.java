package HomeWork10_03_23;

import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        String str = "Мама мыла раму";
        Iterator<Character> wordSymbolsIterator = new wordSymbolsIterator(str);
        while(wordSymbolsIterator.hasNext()) {
            System.out.println(wordSymbolsIterator.next());
        }
    }
}
