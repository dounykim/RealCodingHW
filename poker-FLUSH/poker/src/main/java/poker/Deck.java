package poker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardList = new ArrayList<Card>();


    public Deck(int deckCounter) {
        for(int i = 1; i <14; i++){
            for (Suit suit : Suit.values()){
                Card card = new Card(i, suit);
                cardList.add(card);
            }
        }
        Collections.shuffle(cardList);
    }

    public int getTotalCard() {
        return cardList.size();
    }

    public Card drawcard() {
        if(cardList.size() != 0)
            return cardList.remove(0);
        throw new NoMoreCardException();

    }
}
