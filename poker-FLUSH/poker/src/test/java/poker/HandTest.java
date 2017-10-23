package poker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HandTest {
    @Test
    public void 다섯장의_카드를_덱에서뽑으면_핸드는_다섯장이다() {
        Deck deck = new Deck(1);
        Hand hand = new Hand();
        for (int i = 1; i < 6; i++)
            hand.addCard(deck.drawcard());
        assertTrue(hand.getTotalCount() == 5);
    }
}
