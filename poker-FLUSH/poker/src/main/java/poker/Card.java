package poker;

public class Card {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        if (rank > 13 || 0 >= rank) {
            throw new NoSearchRankException();

        }
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}
