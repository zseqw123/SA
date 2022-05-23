import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Player {
    static final Scanner IN = new Scanner(System.in);
    protected String name;
    protected int point;
    static int playerAmount = 0;
    List<Card> hand = new ArrayList<>();
    Showdown showdown;
    ExchangeHands exchangeHands;

    public Player() {
        playerAmount++;
        name = nameSelf();
    }

    public void getPoint(){
        point++;
    }

    public abstract String nameSelf();

    public abstract Card show();

    public abstract boolean decideWhetherToExchange();






}
