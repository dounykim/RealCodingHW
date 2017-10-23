package poker;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    List<Card> cardListofHand = new ArrayList<Card>();

    public void addCard(Card card) {
        cardListofHand.add(card);
    }

    public int getTotalCount() {
        return cardListofHand.size();
    }

    public List<Card> getHandList() {
        return cardListofHand;
    }
}
