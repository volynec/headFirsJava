package chap15.ex2;

/**
 * Created by user on 06.02.2017.
 */
public class BankAccount {
    private int balance = 100;
    public int getBalance(){
        return balance;
    }
    public void  withdraw (int amount){
        balance = balance- amount;
    }
}
