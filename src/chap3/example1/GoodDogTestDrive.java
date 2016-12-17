package chap3.example1;

/**
 * Created by user on 25.09.2016.
 */
public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("first dog " + one.getSize());
        System.out.println("second dog " + two.getSize());
        one.bark();
        two.bark();
    }
}
