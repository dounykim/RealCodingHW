package poker;

        import java.util.*;


public class Evaluator {

    public String evaluate(Hand hand){
        if (hand.getTotalCount()!=5) {
            throw new NotFullHandException();
        } else if (isRoyalFlush(hand)) {
            return "ROYAL_STRAIGHT_FLUSH";
        } else if (isFourOfAKind(hand)) {
            return "FOUR_OF_A_KIND";
        } else { // bad poker hand
            return null;
        }
    }

    /**
     * Checks a hand for a royal flush.
     */
    boolean isRoyalFlush(Hand hand) {
        List<Integer> royals = Arrays.asList([1, 10, 11, 12, 13])
        Set<Integer> suits = new HashSet<Integer>();
        for (Card card : hand.getHandList()) {
            if (royals.contains(card.getRank())) {
                royals.remove(new Integer(card.getRank()));
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
            if (ranks.containsKey(card.getRank())) {
                ranks.put(card.getRank(), ranks.get(card.getRank()) + 1);
            } else {
                ranks.put(card.getRank(), 1);
            }
        }

        // check if the map contains a count of four.
        return false;
    }

}

