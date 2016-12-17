package app2;

/**
 * Created by user on 07.12.2016.
 */
public class Quest{
    static int j=2;
    public static void result(int i){
        i*=10;
        j+=2;
    }
    public static void main(String[] args){
        char i='2';
        result(i);
        System.out.println(i+" "+j);
    }
}




