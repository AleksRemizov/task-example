import java.util.ArrayList;

public class ExecutorBattleship {
    private BattleShipHelper helper = new BattleShipHelper();
    private ArrayList<Ship> shipsList = new ArrayList<Ship>();
    private int numberOfGuesses = 0;

    private void setUpGame(){
        Ship one = new Ship();
        one.setName("ЛИНКОР");
        Ship two = new Ship();
        two.setName("КРЕЙСЕР");
        Ship three = new Ship();
        three.setName("БАРКАС");


    }


}
