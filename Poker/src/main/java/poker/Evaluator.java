package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Evaluator {

    public String evaluate(Hand hand){
        if (hand.getTotalCount()!=5) {
            throw new NotFullHandException();
        } else if (isRoyalFlush(hand)) {
            return "ROYAL_STRAIGHT_FLUSH";
        } else if (isFourOfAKind(hand)) {
            return "Four_of_a_Kind";
        } else { // bad poker hand
            return null;
        }
    }

    /**
     * Checks a hand for a royal flush.
     */
    boolean isRoyalFlush(Hand hand) {
        // create royals list
        Set<Integer> royals = new HashSet();
        royals.add(10);
        royals.add(11);
        royals.add(12);
        royals.add(13);
        royals.add(1);

        // track suit of the royals
        Set<Suit> suits = new HashSet<Suit>();
        for (Card card : hand.getHandList()) {
            if (royals.contains(card.getRank())) {
                royals.remove(card.getRank());
                suits.add(card.getSuit());
            }
        }

        // royal straight of the same suit
        return (royals.size() == 0) && (suits.size() == 1);
    }

    /**
     * Checks a hand for four of a kind.
     */
    boolean isFourOfAKind(Hand hand) {
        Map<Integer, Integer> ranks = new HashMap<Integer, Integer>();
        for (Card card : hand.getHandList()) {
            // increment rank count in table
            if (ranks.containsKey(card.getRank())) {
                ranks.put(card.getRank(), ranks.get(card.getRank()) + 1);
            } else {
                ranks.put(card.getRank(), 1);
            }
        }

        // map contains at least four of a kind
        return Collections.max(ranks.values()) >= 4;
    }

}



