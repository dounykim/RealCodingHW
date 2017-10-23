package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cardListofDeck = new ArrayList<Card>();

    public Deck(int deckCount) {
        for (int i = 1; i < 14; i++ ){
            for (Suit suit : Suit.values()){
                Card card = new Card(i, suit);
                cardListofDeck.add(card);
            }
        }
        Collections.shuffle(cardListofDeck);
    }

    public int getTotalCard(){
        return cardListofDeck.size();
    }

    public Card drawCard() {
        if (cardListofDeck.size() > 0) {
            return cardListofDeck.remove(0);
        }
        throw new NoMoreCardException();
    }
}
