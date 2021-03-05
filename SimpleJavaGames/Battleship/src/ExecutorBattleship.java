import java.util.ArrayList;

public class ExecutorBattleship {
    private BattleShipHelper helper = new BattleShipHelper();
    private ArrayList<Ship> shipsList = new ArrayList<Ship>();
    private int numberOfGuesses = 0;

    private void setUpGame(){
        Ship firstShip = new Ship();
        firstShip.setName("ЛИНКОР");
        Ship secondShip = new Ship();
        secondShip.setName("КРЕЙСЕР");
        Ship thirdShip = new Ship();
        thirdShip.setName("БАРКАС");
        shipsList.add(firstShip);
        shipsList.add(secondShip);
        shipsList.add(thirdShip);
        System.out.println("ВАША ЦЕЛЬ ПОТОПИТЬ : ЛИНКОР,КРЕЙСЕР,БАРКАС ИСПОЛЬЗУЯ МИНИМУМ ХОДОВ!");
        for (Ship shipsToSet:
             shipsList){
            ArrayList<String> newLocation = helper.movieShips(3);
            shipsToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!shipsList.isEmpty()){
            String userGuess = helper.getUserInput("СДЕЛАЙТЕ ХОД!");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess( String userGuess){
        numberOfGuesses++;
        String result = "МИМО!";
        for( Ship shipToTest : shipsList){
            result = shipToTest.checkYourselfAnswer(userGuess);
            if (result.equals("ПОПАЛ!")){
                break;
            }if(result.equals("ПОТОПИЛ!")){
                shipsList.remove(shipToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("ВСЕ КОРАБЛИ УШЛИ КО ДНУ!");
        if (numberOfGuesses <= 18) {
            System.out.println("ЭТО ЗАНЯЛО У ВАС ВСЕГО " + numberOfGuesses + "ПОПЫТОК.");
        }else {
            System.out.println("ЭТО ЗАНЯЛО УВАС ДОВОЛЬНО МНОГО " + numberOfGuesses + "ПОПЫТОК.");
        }
    }

    public static void main(String[] args) {
        ExecutorBattleship battleship = new ExecutorBattleship();
        battleship.setUpGame();
        battleship.startPlaying();
    }


}
