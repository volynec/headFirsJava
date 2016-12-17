package chap3.example2;

/**
 * Created by user on 25.09.2016.
 */
public class XCopy {
    public static void main(String[] args) {
        int orig = 43;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    int go (int arg){
         arg = arg * 2;
        return arg;
    }
}
