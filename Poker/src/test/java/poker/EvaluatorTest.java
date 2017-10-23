package poker;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class EvaluatorTest {

    @Test
    public void 로열스트레이트_플러쉬_검증_성공(){
        Hand hand = new Hand();
        hand.addCard(new Card(10,Suit.SPADE));
        hand.addCard(new Card(11,Suit.SPADE));
        hand.addCard(new Card(12,Suit.SPADE));
        hand.addCard(new Card(13,Suit.SPADE));
        hand.addCard(new Card(1,Suit.SPADE));

        Evaluator evaluator = new Evaluator();
        String result = evaluator.evaluate(hand);
        assertTrue(result.equals("ROYAL_STRAIGHT_FLUSH"));

    }
    @Test
    public void 포카드_검증_성공(){
        Hand hand = new Hand();
        hand.addCard(new Card(2,Suit.SPADE));
        hand.addCard(new Card(2,Suit.CLUB));
        hand.addCard(new Card(2,Suit.DIAMOND));
        hand.addCard(new Card(2,Suit.HEART));
        hand.addCard(new Card(3,Suit.SPADE));

        Evaluator evaluator = new Evaluator();
        String result = evaluator.evaluate(hand);
        assertTrue(result.equals("Four_of_a_Kind"));

    }
}
