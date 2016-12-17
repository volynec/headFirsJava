package polymorphism.Dynamic.ex1;

/**
 * Created by user on 10.10.2016.
 */
public class Test {
    public static void main(String[] args){

        Vehicle vh=new MotorBike();

        vh.move();    // prints MotorBike can move and accelerate too!!

        vh=new Vehicle();

        vh.move();    // prints Vehicles can move!!

    }
}
