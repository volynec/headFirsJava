package app2;

/**
 * Created by user on 10.12.2016.
 */
public class A {
    int a;
    int b=a+2; //1

    
    private A(int b){
        a=b; }  //3
    A ob=new A(4);  //4
}
