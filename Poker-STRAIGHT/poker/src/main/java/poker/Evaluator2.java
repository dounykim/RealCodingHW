package poker;

import poker.poker.Card;
import poker.poker.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Evaluator2 {

    public String evaluate(Hand hand) {
        if (hand.getCardCount() != 5) {
            throw new NotFullHandException();
        }

        boolean isStraight = false;
        List<Integer> royalRank = new ArrayList<Integer>();
        royalRank.add(2);
        royalRank.add(4);
        royalRank.add(3);
        royalRank.add(5);
        royalRank.add(1);

        List<Card> handList = hand.getHandList();
        Collections.sort(handList);

        List<Integer> compareRank = new ArrayList<Integer>();
        for(int i=0; i<royalRank.size(); i++)  {
            if(handList.get(i).getRank() >= 10)
                compareRank.add(handList.get(i).getRank()-13);
            else
                compareRank.add(handList.get(i).getRank());
        }
        Collections.sort(compareRank);

        for (int i=0; i<handList.size()-1; i++) {
            Integer card1 = compareRank.get(i);
            Integer card2 = compareRank.get(i+1);
            if (card1+1 != card2) {
                isStraight = false;
                break;
            }
            if(card1<1 || card2<1) {
                if(card1<1 && royalRank.contains(card1+13))
                    royalRank.remove(new Integer(card1+13));
                if(card2<1 && royalRank.contains(card2+13))
                    royalRank.remove(new Integer(card2+13));
                if(card1>0 && royalRank.contains(card1))
                    royalRank.remove(new Integer(card1));
                if(card2>0 && royalRank.contains(card2))
                    royalRank.remove(new Integer(card2));
            }
            else {
                if(card1<1 && royalRank.contains(card1+13))
                    royalRank.remove(new Integer(card1+13));
                if(card2<1 && royalRank.contains(card2+13))
                    royalRank.remove(new Integer(card2+13));
                if(card1>0 && royalRank.contains(card1))
                    royalRank.remove(new Integer(card1));
                if(card2>0 && royalRank.contains(card2))
                    royalRank.remove(new Integer(card2));
            }
        }
        if (royalRank.size() == 0) {
            isStraight = true;
        }
        if (isStraight) {
            return "STRAIGHT";
        }
        return null;
    }
}

