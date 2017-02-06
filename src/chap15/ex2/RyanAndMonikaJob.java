package chap15.ex2;

/**
 * Created by user on 06.02.2017.
 */
public class RyanAndMonikaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonikaJob theJob = new RyanAndMonikaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monika");
        one.start();
        two.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithdrawal(10);
            if (account.getBalance()<0){
                System.out.println("Превышение лимита");
            }
        }
    }

    private void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " Собирается снять деньги");
            try {
                System.out.println(Thread.currentThread().getName() + " идет подремать");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " Просыпается");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" Заканчивает транзакцию");
        }
        else {
            System.out.println("Извените для клинта "+ Thread.currentThread().getName()+ " недостаточно денег");
        }
    }
}
