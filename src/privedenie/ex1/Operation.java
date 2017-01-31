package privedenie.ex1;

/**
 * Created by user on 31.01.2017.
 */
abstract public class Operation {

    String operation;
    int a;
    int b;

    public Operation (String operation) {
        this.operation = operation;
    }

    public  void calculate(String s) {

        String[] num = s.split("\\D+");
        a = Integer.parseInt(num[0]);
        b = Integer.parseInt(num[1]);
    }
}
