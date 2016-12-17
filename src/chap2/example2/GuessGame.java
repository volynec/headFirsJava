package chap2.example2;

/**
 * Created by user on 18.09.2016.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isTight = false;
        boolean p2isTight = false;
        boolean p3isTight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9 ...");

        while (true) {
            System.out.println("Число, которе  нужно угадать, = " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это число " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это число " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это число " + guessp3);

            if (guessp1 == targetNumber) {
                p1isTight = true;
            }
            if (guessp2 == targetNumber) {
                p2isTight = true;
            }
            if (guessp3 == targetNumber) {
                p3isTight = true;
            }
            if (p1isTight || p2isTight || p3isTight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isTight);
                System.out.println("Второй игрок угадал? " + p2isTight);
                System.out.println("Третий игрок угадал? " + p3isTight);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игрок должен попробовать еще раз.");
            }
        }
    }
}
