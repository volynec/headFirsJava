package serializationTest;

/**
 * Created by user on 04.02.2017.
 */
public  class Parent {
    protected int field;
    protected Parent(){
        field = 5;
        System.out.println("Parent::Constructor");
    }
    public int getField() {
        return field;
    }
}