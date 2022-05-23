public enum Rank {
    ONE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    J("J"),
    Q("Q"),
    K("K");

    String val;

    Rank(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}
