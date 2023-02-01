import java.util.Random;
import java.util.Scanner;

public class Deal implements Initializable {
    public static void main(String[] args) {
        String[] deck = new String[NumberOfCards.NUMBER_OF_CARDS.i];

        Initializable.initialization(deck);

        Shufflable.shuffle(deck);

        Displaylable.display(NumberOfPlayers.getPlayers(1), deck);
    }
}