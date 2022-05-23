import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final static int TOTAL_SUITS = 4;
    private final static int TOTAL_RANKS = 13;
    final List<Card> cards = new ArrayList<>();


    public void combineDeck() {
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for (int i = 0; i < TOTAL_SUITS; i++) {
            for (int j = 0; j < TOTAL_RANKS; j++) {
                cards.add(new Card(suits[i], ranks[j]));
            }
        }
    }

    public void shuffle() {
        System.out.print("洗牌中):");
        Collections.shuffle(cards);
    }
}
