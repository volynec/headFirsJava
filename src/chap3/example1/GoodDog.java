package chap3.example1;

/**
 * Created by user on 25.09.2016.
 */
public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Gav");
        } else if (size > 14) {
            System.out.println("Vuf");
        } else {
            System.out.println("Tsyaf");
        }
    }
}

