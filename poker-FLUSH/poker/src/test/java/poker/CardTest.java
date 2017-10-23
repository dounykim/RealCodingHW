package poker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CardTest {
    @Test
    public void 카드_다이아몬드_5생성_성공() {
        Card card = new Card(5, Suit.DIAMOND);
        Suit suit = card.getSuit();
        int rank = card.getRank();
        assertTrue(rank == 5);
        assertTrue(suit == Suit.DIAMOND);
    }

    @Test(expected = NoSearchRankException.class)
    public void 카드_랭크_14이상_생성시_에러발생(){
        Card card = new Card(16, Suit.HEART);
    }

    @Test(expected = NoSearchRankException.class)
    public void 카드_랭크_0이하_생성시_에러발생() {
        Card card = new Card(0, Suit.HEART);
    }


}
