package poker;

import org.junit.Test;
import poker.poker.Card;
import poker.poker.Suit;

import static org.junit.Assert.assertTrue;

public class EvaluatorTest {

    @Test
    public void 로열스트레이트_플러쉬_검증_성공() {
        Hand hand = new Hand();
        hand.addCard(new Card(10, Suit.SPADE));
        hand.addCard(new Card(11, Suit.SPADE));
        hand.addCard(new Card(12, Suit.SPADE));
        hand.addCard(new Card(13, Suit.SPADE));
        hand.addCard(new Card(1, Suit.SPADE));

        Evaluator evaluator = new Evaluator();
        String result = evaluator.evaluate(hand);
        assertTrue(result.equals("ROYAL_STRAIGHT_FLUSH"));

    }

}
