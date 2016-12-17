package konstruktor;

/**
 * Created by user on 26.10.2016.
 */
public class MyPoint {

    int age = 45;	                    // non-static variable
    static double salary = 8877.66;   // static variable

    public static void display()	    // static method
    {
        System.out.println("Hello World");
    }

    public static void main(String args[])
    {
        // System.out.println(age);     // raises error, it is non-static and requires object
        System.out.println(salary);     // works fine as salary is static, object not required
        display();		            // works fine as display() is static, object not required
    }
}
