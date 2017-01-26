package chap10.examlpe2;

/**
 * Created by user on 25.01.2017.
 */
public class StaticTest extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 10);
        System.out.println("Статический блок " + rand);
    }

    StaticTest() {
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        System.out.println("Внутри mian");
        StaticTest st = new StaticTest();
    }

    byte x = 0;
    byte y = 0;
    byte c = (byte) (x+y);
}
