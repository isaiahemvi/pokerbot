import java.util.Random;
import java.util.Arrays;

/**
 * A human vs bot poker game
 * 
 */
public class PokerBot{
    public static void main(String[] args) {
            Deck.fillNewDeck();
            System.out.println(Deck.draw());
    }
}