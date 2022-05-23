public class ExchangeHands {
    private int countdown = 3;
    private Player exchange;
    private Player exchangeTarget;

    public ExchangeHands(Player exchange, Player exchangeTarget) {
        this.exchange = exchange;
        this.exchangeTarget = exchangeTarget;
        change();
    }
    private void change(){

    }

    public void countdown(){
        countdown--;
        if(countdown == 0){

        }
    }
}
