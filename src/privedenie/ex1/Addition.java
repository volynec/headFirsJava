package privedenie.ex1;

/**
 * Created by user on 30.01.2017.
 */
public class Addition extends Operation {

    public Addition(String operation) {
        super(operation);
    }

    @Override
    public void calculate(String s) {
        String[] num = s.split("\\D+");
        a = Integer.parseInt(num[0]);
        b = Integer.parseInt(num[1]);
        c = a+b;
        getResult();
    }


}
