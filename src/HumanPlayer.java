public class HumanPlayer extends Player {


    @Override
    public String nameSelf() {
        String name;
        System.out.print("玩家" + playerAmount + "名字:)");
        do {
            name = IN.nextLine();
        } while (name.isEmpty());

        return name;
    }

    @Override
    public Card show() {
        return null;
    }

    @Override
    public boolean decideWhetherToExchange() {
        return false;
    }



}
