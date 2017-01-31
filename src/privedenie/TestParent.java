package privedenie;

/**
 * Created by user on 27.01.2017.
 */
public class TestParent {
    public static void main(String[] args) {
        Parent p=new Child();
        if (p instanceof Child) {
            Child c = (Child)p;

        }
        Parent p2=new Child2();
        if (p2 instanceof Child) {
            Child c = (Child)p2;

        }
        Parent p3=new Parent();
        if (p3 instanceof Child) {
            Child c = (Child)p3;

        }
    }
}
