package chap10.example3;

/**
 * Created by user on 25.01.2017.
 */
public class TestBox {

    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i; // NullPointerException
        System.out.println(j);
        System.out.println(i);

    }
}
