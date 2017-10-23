package poker;

import org.junit.Test;
import poker.poker.Card;
import poker.poker.Suit;

import static org.junit.Assert.assertTrue;

public class STRAIGHT {

    @Test
    public void 스트레이트_검증_성공() {
        Hand hand = new Hand();
        hand.addCard(new Card(2, Suit.DIAMOND));
        hand.addCard(new Card(4, Suit.SPADE));
        hand.addCard(new Card(3, Suit.CLUB));
        hand.addCard(new Card(5, Suit.SPADE));
        hand.addCard(new Card(1, Suit.HEART));

        Evaluator2 evaluator = new Evaluator2();
        String result = evaluator.evaluate(hand);
        assertTrue(result.equals("STRAIGHT"));

    }

}