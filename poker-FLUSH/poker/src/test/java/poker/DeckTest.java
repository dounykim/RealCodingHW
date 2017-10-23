package poker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DeckTest {
    @Test
    public void Deck_1개의_총카드수는_52개이다() {
        Deck deck = new Deck(1);
        assertTrue(deck.getTotalCard() == 52);
    }

    @Test
    public void Deck_한개에서_카드를_한장뽑으면_총카드수는_51이다(){
        Deck deck = new Deck(1);
        Card card = deck.drawcard();
        assertTrue(deck.getTotalCard() == 51);
    }

    @Test(expected = NoMoreCardException.class)
    public void Deck_1개에서_더이상_카드가없을때_draw하면_에러발생(){
        Deck deck = new Deck(1);
        for (int i = 1; i < 53; i++){
            deck.drawcard();

        }

        deck.drawcard();
    }
}
