package chap3;

/**
 * Created by user on 25.09.2016.
 */
public class Dog2 {
    void bark(int numOfBarks){
        while (numOfBarks >0){
            System.out.println("Gav!");
            numOfBarks = numOfBarks-1;
        }
    }
    public static void main(String[] args) {
        Dog2  dog = new Dog2();
        dog.bark(3);
    }


}
