package chap5_SeaFight;

import java.util.ArrayList;

/**
 * Created by user on 27.09.2016.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numberOfGuesses = 0;
        GameHelper helper = new GameHelper();
      SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
       int[] locations = {randomNum, randomNum+1,randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("Enter the number");
            String result = theDotCom.checkYourself(guess);
            numberOfGuesses++;
            if (result.equals("Potopil")) {
                isAlive = false;
                System.out.println("Vam potrebovalos " + numberOfGuesses + " popitok");
            }
        }
    }
}

