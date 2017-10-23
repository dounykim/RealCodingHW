package poker;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> handList = new ArrayList<Card>();
    private boolean cardCount;

    public void addCard(Card card) {
        if ( handList.size() > 5 ) {
            throw new NoMoreCardException();
        }
        handList.add(card);

    }

    public int getTotalCount() {
        return handList.size();
    }

    public List<Card> getCardList() {
        return handList;
    }

    public boolean getCardCount() {
        return cardCount;
    }

    public List<Card> getHandList() {
        return handList;
    }
}
