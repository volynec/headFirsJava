package chap3;

/**
 * Created by user on 25.09.2016.
 */
public class TestStaff {

    public static void main(String[] args) {
        int foo = 7;
        int bar = 3;
        int qwe = 5;
        takeTwo(12, 34);
        takeThree(foo, bar, qwe);
    }

    static void takeTwo(int x, int y) {
        int z = x + y;
        System.out.println("Summa ravna" + z);
    }


    static void takeThree(int x, int y, int z) {
        int q = x + y + z;
        System.out.println("Total is" + q);
    }
}
