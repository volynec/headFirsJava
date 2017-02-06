package serializationTest;

import java.io.Serializable;

/**
 * Created by user on 04.02.2017.
 */
public  class Child extends Parent implements Serializable {
    protected int i;
    public Child(int i){
        this.i = i;
        System.out.println("Child::Constructor");
    }
    public int getI() {
        return i;
    }
}
