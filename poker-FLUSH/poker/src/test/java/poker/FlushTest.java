package poker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;





import java.util.ArrayList;
import java.util.List;

public class FlushTest {

    @Test
    public void isFlush_나올때_까지_돌리기() {

        Boolean isFlush;
        List<Card> HandCards;
        int count = 0;
        while(true) {
            isFlush = true;
            Deck deck = new Deck(1);
            Hand hand = new Hand();
            for (int i = 0; i < 5; i++)
                hand.addCard(deck.drawcard());

            HandCards = hand.getCardList();

            for (int i = 1; i < hand.getTotalCount(); i++) {
                if (!HandCards.get(0).getSuit().equals(HandCards.get(i).getSuit()))
                    isFlush = false;
            }
            if(isFlush)
                break;
            else
                count++;
        }
        System.out.print("게임 횟수 : " + count);
        assertTrue(isFlush);
    }

    @Test
    public void isFlush_다이아5_5장_뽑으면_플러쉬_판정() {
        Hand hand = new Hand();
        Card card;
        Boolean isFlush = true;
        List<Card> HandCards;
        for (int i = 0; i < 5; i++)
            hand.addCard(new Card(5,Suit.DIAMOND));
        HandCards = hand.getCardList();

        for (int i = 1; i < hand.getTotalCount(); i++) {
            if (!HandCards.get(0).getSuit().equals(HandCards.get(i).getSuit()))
                isFlush = false;
        }

        assertTrue(isFlush);
    }

}
