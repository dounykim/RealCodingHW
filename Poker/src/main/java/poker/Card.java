package poker;

public class Card {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit){
        if (rank > 13 || rank < 1){
            throw new NoSuchRankException();
        }
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;

    }

    public Suit getSuit() {
        return suit;
    }
}
