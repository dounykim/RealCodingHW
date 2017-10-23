package poker;

import org.junit.Test;
import poker.poker.Card;

import static junit.framework.TestCase.assertTrue;


public class DeckTest {

    @Test
    public void Deck_1개의_총가드수는_52개이다(){
        Deck deck =new Deck(1);
        assertTrue(deck.getTotalCard()==52);
    }

    public void Deck_1개에서_카드한장을뽑으면_총가드수는_51개이다(){
        Deck deck = new Deck( 1);
        Card card = deck.drawCard();
        assertTrue(deck.getTotalCard()==51);
    }
    @Test(expected = NomoreCardException.class)
    public void Deck_1개에서_더이상_카드가없을때_draw하면_에러발생(){
        Deck deck = new Deck(1);
        for (int i = 1; i<53; i++){
            deck.drawCard();

        }
        deck.drawCard();
    }
}
