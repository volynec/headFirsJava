package javabegin;

/**
 * Created by user on 12.10.2016.
 */
public class Platypus {
    String name;

    Platypus(String input) {
        name = input;
    }

    Platypus() {
        this("John/Mary Doe");
    }

    public static void main(String args[]) {
        Platypus p1 = new Platypus("digger");
        Platypus p2 = new Platypus();
    }
}
