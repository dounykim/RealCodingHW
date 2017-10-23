package poker.poker;

public class Card implements Comparable<Card> {

    private int rank;
    private Suit suit;


    public Card(int rank, Suit suit) {
        if(rank>13 || rank < 0) {
            throw new NoSuchRankException();
        }
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public  Suit getSuit() {
        return suit;
    }

    public int compareTo(Card card) {
        int compareRank = card.getRank();
        return this.rank - compareRank;
    }
}
