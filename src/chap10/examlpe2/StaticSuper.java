package chap10.examlpe2;

/**
 * Created by user on 25.01.2017.
 */
public class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }
    StaticSuper(){
        System.out.println("Родительский конструктор");
    }

}
