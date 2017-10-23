package poker;

import org.junit.Test;
import poker.poker.Card;
import poker.poker.NoSuchRankException;
import poker.poker.Suit;

import static org.junit.Assert.assertTrue;

public class CardTest {

    @Test
    public void 카드_다이야몬드_5생성_성공(){
        Card card = new Card(5, Suit.DIAMOND);
        int rank = card.getRank();
        Suit suit = card.getSuit();
        assertTrue(rank == 5);
        assertTrue(suit == Suit.DIAMOND);
    }

    @Test(expected = NoSuchRankException.class)
    public void 카드_랭크_14이상_생성시_에러발생(){
        Card card = new Card(16, Suit.HEART);
    }

    @Test(expected = NoSuchRankException.class)
    public void 카드_랭크_음수시_에러발생(){
        Card card = new Card( -3, Suit.HEART);
    }
}
