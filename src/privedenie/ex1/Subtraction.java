package privedenie.ex1;

/**
 * Created by user on 30.01.2017.
 */
class Subtraction extends Operation {

    public Subtraction(String operation) {
        super(operation);
    }

    @Override
    public void calculate(String s) {
        String[] num = s.split("\\D+");
        a = Integer.parseInt(num[0]);
        b = Integer.parseInt(num[1]);
        c = a-b;
        getResult();
    }
}