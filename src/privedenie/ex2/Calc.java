package privedenie.ex2;

/**
 * Created by user on 01.02.2017.
 */
public class Calc {
    public static int metodCalc(int n1, String op, int n2){
        int res = 0;
        switch (op){
            case "+": res= n1+n2;
                break;
            case "-": res= n1-n2;
                break;
            case "*": res= n1*n2;
                break;
            case "/": res= n1/n2;
                break;
        }
        return res;
    }
}
