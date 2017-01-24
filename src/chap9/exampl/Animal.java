package chap9.exampl;

/**
 * Created by user on 24.01.2017.
 */
public class Animal {
    private String name;
    public Animal(String theName){
        System.out.println("Созадем Animal " + theName);
        name = theName;
    }
public String gerName(){
    return name;
}
}
