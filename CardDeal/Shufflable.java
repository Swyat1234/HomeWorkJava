import java.util.Random;

public interface Shufflable {
    static void shuffle(String[] deck) {
        final Random random = new Random();

        for (int i = 0; i < NumberOfCards.NUMBER_OF_CARDS.i; i++) {
            int card = i + (random.nextInt(NumberOfCards.NUMBER_OF_CARDS.i - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }
}
