package javabegin;

/**
 * Created by user on 11.10.2016.
 */
public class Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(int speed) {

        this.speed = speed;
    }

    public Car(){

    }

    public void drive() {
        System.out.println("car drive");
    }
}
