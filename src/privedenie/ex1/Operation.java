package privedenie.ex1;

/**
 * Created by user on 31.01.2017.
 */
abstract public class Operation {

    String operation;
    int a;
    int b;
    int c;


    public Operation (String operation) {
        this.operation = operation;
    }

    public abstract void calculate(String s);

    void getResult() {
        System.out.println(a + " " + operation + " " + b + " результат = " + c);
    }

}
