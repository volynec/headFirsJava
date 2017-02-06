package chap15.ex1;

/**
 * Created by user on 06.02.2017.
 */
public class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("поток альфа");
        beta.setName("поток бета");
        alpha.start();
        beta.start();
    }


    @Override
    public void run() {
        for (int i = 0; i <25 ; i++) {
            String thredName = Thread.currentThread().getName();
            System.out.println("Сейчас работает " +thredName);
        }
    }
}
