package chap5_SeaFight;

import java.util.ArrayList;

/**
 * Created by user on 29.09.2016.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    ArrayList<Integer> gList = new ArrayList<>();

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        if (gList.contains(guess)) {
            System.out.println("Next number");
            return "Next number";
        } else {
            gList.add(guess);
        }

        String result = "Mimo";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Popal";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Potopil";
        }
        System.out.println(result);
        return result;
    }
}
