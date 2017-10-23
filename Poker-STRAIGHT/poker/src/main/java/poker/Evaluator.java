package poker;

import poker.poker.Card;
import poker.poker.Suit;

import java.util.ArrayList;
import java.util.List;

public class Evaluator {

    public String evaluate(Hand hand) {
        if (hand.getCardCount() != 5) {
            throw new NotFullHandException();
        }

        boolean isRoyalStraightFlush = true;
        List<Integer> royalRank = new ArrayList<Integer>();
        royalRank.add(1);
        royalRank.add(10);
        royalRank.add(11);
        royalRank.add(12);
        royalRank.add(13);

        List<Card> handList = hand.getHandList();

        for (Card card : handList) {
            if (card.getSuit() != Suit.SPADE) {
                isRoyalStraightFlush = false;
                break;
            }

            if (royalRank.contains(card.getRank())) {
                royalRank.remove(new Integer(card.getRank()));
            }
        }

        if (royalRank.size() == 0) {
            isRoyalStraightFlush = true;

        }
        if (isRoyalStraightFlush) {
            return "ROYAL_STRAIGHT_FLUSH";
        }
        return null;
    }

}

