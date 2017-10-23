package poker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static poker.Suit.DIAMOND;
import static poker.Suit.HEART;

public class CardTest {

    @Test
    public void 카드_다이아몬드_5생성_성공(){
        Card card = new Card(5,DIAMOND);
        int rank = card.getRank();
        Suit suit = card.getSuit();
        assertTrue(rank==5);
        assertTrue(suit.equals(DIAMOND));
    }
    @Test(expected = NoSuchRankException.class)
    public void 카드_랭크_14이상_생성시_에러발생(){
        Card card = new Card(16, HEART);
    }
    @Test(expected = NoSuchRankException.class)
    public void 카드_랭크_0이하_생성시_에러발생(){
        Card card = new Card(0, HEART);
    }



}
