package polymorphism.Static;

/**
 * Created by user on 10.10.2016.
 */
public class Test {
    public static void main(String[] args){

        DemoOverload demo=new DemoOverload();

        System.out.println(demo.add(2,3));      //method 1 called

        System.out.println(demo.add(2,3,4));    //method 2 called

        System.out.println(demo.add(2,3.4));    //method 4 called

        System.out.println(demo.add(2.5,3));    //method 3 called

    }
}
