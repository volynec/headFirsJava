package privedenie.ex1;

/**
 * Created by user on 30.01.2017.
 */
class Subtraction extends Operation {

    public Subtraction(String operation) {
        super(operation);
    }

    public void getResult(String s) {
        int result = a + b;
        System.out.println(a + " " + operation + " " + b + " результат = " + result);
    }
}