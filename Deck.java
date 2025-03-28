import java.util.Random;
import java.util.ArrayList;

public class Deck {

    /** */
    public static final int DECK_SIZE = 52;
    
    /**
     * 
     * 
     */
    public static Card[] deck = new Card[DECK_SIZE]; 

    public static void fillNewDeck(){
        int count = 0;
            for(int rank = 2; rank<15; rank++){
                for(int suit = 0; suit<4; suit++){
                    deck[count] = new Card(rank, suit);
                    count++;
                }
            }
    }

    public static ArrayList<Card> usedCards = new ArrayList<Card>();

    public static boolean cardInUse(Card card){
        // for(int i = 0; i < usedCards.size(); i++){
        //     if(usedCards.get(i).equals(card)){
        //         return false;
        //     }
        // }
        return true;
    }

    public static String cardToString(Card card){
        String rank = Integer.toString(card.rank);
        String suit = "";

        switch(card.suit){
            case 0:
                suit = "Hearts";
                break;
            case 1: 
                suit = "Diamonds";
                break;
            case 2:
                suit = "Spades";
                break;
            case 3:
                suit = "Clubs";
                break;
        }

        switch(rank){
            case "11":
                rank = "Jack";
                break;
            case "12":
                rank = "Queen";
                break;
            case "13":
                rank = "King";
                break;
            case "14":
                rank = "Ace";
                break;
        }

        return rank + " of " + suit;
    }

    /**
     * 
     */
    public static String draw()
    {
        Random random = new Random();
        int indexCard1 = random.nextInt(2,52);;
        int indexCard2 = random.nextInt(2,52);;

        // while(cardInUse(new Card(0,0))){
        //     indexCard1 = random.nextInt(2,52);
        // }
        usedCards.add(deck[indexCard1]);

        // while(cardInUse(deck[indexCard2])){
        //     indexCard2 = random.nextInt(2,52);
        // }
        usedCards.add(deck[indexCard2]);

        return cardToString(usedCards.get(0));
    }

}
