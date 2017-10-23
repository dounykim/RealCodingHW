package poker;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;


public class DeckTest {

    @Test
    public void Deck_1개의_총카드수는_52장이다(){
        Deck deck = new Deck(1);
        assertTrue(deck.getTotalCard() == 52);
    }

    @Test
    public void Deck_1개에서_카드한장을뽑으면_총카드의수는_51개이다() {
        Deck deck = new Deck(1);
        Card card = deck.drawCard();
        assertTrue(deck.getTotalCard() == 51);
    }
    @Test(expected=NoMoreCardException.class)
    public void Deck_1개에서_더이상뽑을카드가없을때_또뽑으면_안됨(){
        Deck deck = new Deck(1);
        for (int i=1 ; i < 53; i++){

            Card card = deck.drawCard();
        }
        Card card = deck.drawCard();

    }

}
