package privedenie.ex2;

import java.util.Scanner;

/**
 * Created by user on 01.02.2017.
 */
public class CalcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int n1 = sc.nextInt();
        System.out.println("Введите операцию:");
        String op = sc.next();
        System.out.println("Введите второе число:");
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("Результат: "+ Calc.metodCalc(n1,op,n2) );
    }


}
