package privedenie.ex1;

import chap5_SeaFight.GameHelper;

/**
 * Created by user on 30.01.2017.
 */
public class Calculator {
    public static void main(String s[]) {

        Subtraction subtraction = new Subtraction("вычесть");
        Addition addition = new Addition("прибавить");

        GameHelper in = new GameHelper();
        String inUserInput = in.getUserInput("Enter namber");

        String[] expr = inUserInput.split(";");
        for (int i = 0; i < expr.length; i++) {
            String item = expr[i];
            if (item.contains("+")) {
                addition.calculate(item);
            }else if (item.contains("-")){
             subtraction.calculate(item);
             }
        }
    }
}

