package app3;

/**
 * Created by user on 09.12.2016.
 */
public class JavaDeveloper extends Developer{
    String specialty = "Java Developer";

    public void demonstrateSuperKeyword(){
        JavaDeveloper javaDeveloper = new JavaDeveloper();

        System.out.println("Getting subclass specialty:");
        javaDeveloper.displaySpecialty();

        System.out.println("Getting superclass specialty:");
        super.displaySpecialty();
    }
}