package chap1;

/**
 * Created by user on 17.08.2016.
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 5;
        String word = "бутылок (бутылки)";
        while (beerNum > 0)
        {
            if (beerNum == 1) {
                word = "бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum >0) {
//                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок на стене");
            }
        }
    }
}

