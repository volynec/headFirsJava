package chap2.example1;

/**
 * Created by user on 18.09.2016.
 */
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянный в офисе";
        two.genre = "Комедия";
        two.rating = 5;

        Movie three = new Movie();
        three.title ="Байт-клуб";
        three.genre = "Трагедия";
        three.rating =127;

    }
}
