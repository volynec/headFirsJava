package privedenie.ex1;

/**
 * Created by user on 30.01.2017.
 */
public class Addition extends Operation {

    public Addition(String operation) {
        super(operation);
    }


    public void getResult() {
        int result = a + b;
        System.out.println(a + " " + operation + " " + b + " результат = " + result);
    }
}
