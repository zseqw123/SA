public class Card implements Comparable<Card>{
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public int compareTo(Card card) {
        if(rank == card.rank){
            return suit.compareTo(card.suit);
        }
        return rank.compareTo(card.rank);
    }

    @Override
    public String toString() {
        return suit.toString()+rank.toString();
    }


}


