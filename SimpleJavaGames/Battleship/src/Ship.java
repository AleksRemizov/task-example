import java.util.ArrayList;

public class Ship {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String>location){
        locationCells = location;
    }

    public void setName(String yourName){
        name = yourName;
    }
    public String checkYourselfAnswer(String userInput){
        String result = "МИМО!";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);

        if (locationCells.isEmpty()){
            result = "ПОТОПИЛ!";
            System.out.println("ВЫ ПОТОПИЛИ " + name + "!");
        }else {
            result = "ПОПАЛ!";
        }
        }
        return result;
    }
}
