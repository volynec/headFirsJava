package chap3.example2;

/**
 * Created by user on 25.09.2016.
 */
public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1234");
        String tod =c.getTime();
        System.out.println("Time " + tod);
    }
}
