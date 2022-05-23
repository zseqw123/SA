import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Showdown {
    private static final Scanner IN = new Scanner(System.in);
    private static final int TOTAL_ROUND = 13;
    private static final int MAX_PLAYERS = 4;
    private static final int PLUS_POINT = 1;
    private final Deck deck;
    private List<Player> players;
    private int playerAmount;
    private int aIAmount;

    public Showdown() {
        this.deck = new Deck();
    }

    private void inputPlayerAmount() {
        do {
            System.out.print("輸入玩家數量(0~4 )");
            playerAmount = IN.nextInt();
        } while (playerAmount < 0 || playerAmount > 4);
    }

    private void inputAIAmount() {
        aIAmount = MAX_PLAYERS - playerAmount;
    }

    private void addHumanPlayer() {
        for (int i = 0; i < playerAmount; i++) {
            players.add(new HumanPlayer());
        }
    }

    private void addAIPlayer() {
        for (int i = 0; i < aIAmount; i++) {
            players.add(new AIPlayer());
        }
    }


    public static void main(String[] args) {
        Showdown showdown = new Showdown();
//        Deck deck = new Deck();
//        Player player = new HumanPlayer();
//        deck.combineDeck();
//        deck.shuffle();
        showdown.inputPlayerAmount();
        showdown.inputAIAmount();
//        showdown.addHumanPlayer();
//        showdown.addAIPlayer();
//        player.nameSelf();
//        System.out.println(deck.cards);


    }


}
