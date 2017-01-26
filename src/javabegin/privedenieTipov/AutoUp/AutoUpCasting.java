package javabegin.privedenieTipov.AutoUp;

/**
 * Created by user on 26.01.2017.
 */
public class AutoUpCasting
{
    public static void main(String[] args)
    {
        D d = new D();
        C c = d;       // D type object is Auto-Up Casted to C type
        B b = d;      // D type object is Auto-Up Casted to B type
        C c1 = new C();
        A a = c1;    // C type object is Auto-Up Casted to A type
        A a1 = new B(); // B type object is Auto-Up Casted to A type
    }
}