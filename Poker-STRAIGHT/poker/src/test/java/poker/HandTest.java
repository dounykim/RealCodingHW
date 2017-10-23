package poker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HandTest {

    @Test
    public void 덱에서_한장을뽑으면_핸드는_1개이다(){
        Deck deck = new Deck(1);
        Hand hand = new Hand();
        hand.addCard(deck.drawCard());

        assertTrue(hand.getCardCount() ==1);
    }

}
