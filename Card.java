public class Card{
    /**
     * Card values are as follows:
     * Number cards are their value
     * (E.g deuce is = 2, three = 3, etc)
     * J = 11, Q = 12, K = 13, A = 14
     */
    public int rank;

    /**
     * Suit values are as follows:
     * Hearts = 0, Diamonds = 1,
     * Spades = 2, Clubs = 3.
     * 
     */
    public int suit;

    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }
}