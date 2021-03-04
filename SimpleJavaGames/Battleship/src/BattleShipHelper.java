import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BattleShipHelper {
    private static final String alphabet = "abcdefg";
    private  int fieldLength = 7;
    private int fieldSize = 49;
    private int [] field = new int[fieldSize];
    private int shipCouter = 0;

    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> movieShips(int shipSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[shipSize];
        String temp = null;
        int[] coords = new int[shipSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        shipCouter++;
        int incr = 1;
        if ((shipCouter % 2) == 1) {
            incr = fieldLength;
        }
        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * fieldSize);
            int x = 0;
            success = true;
            while (success && x < shipSize) {
                if (field[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= fieldSize) {
                        success = false;
                    }
                    if (x > 0 && (location % fieldSize == 0)) {
                        success = false;
                    }
                } else {
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int column = 0;
        while (x < shipSize){
            field[coords[x]]=1;
            row = (int) (coords[x]/ fieldLength);
            column = coords[x] % fieldLength;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }

}
