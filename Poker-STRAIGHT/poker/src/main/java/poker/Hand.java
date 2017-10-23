package poker;

import poker.poker.Card;

import java.util.ArrayList;
import java.util.List;

public  class Hand {

    private List<Card> handList = new ArrayList<Card>();

    public void addCard(Card card){
        if (handList.size() >= 5){
            throw new NoMoreHandException();
        }
        handList.add(card);

    }

    public int getCardCount() {
        return handList.size();
    }

    public List<Card> getHandList() {
        return this.handList;
    }
}
