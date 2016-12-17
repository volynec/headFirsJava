package javabegin.pereopredelenie;

/**
 * Created by user on 01.11.2016.
 */
public class Start {
    public static void main(String[] args) {


        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(8, 5);
        Triangle triangle = new Triangle(10, 6);

    Figure fig;
    fig = figure;

        System.out.println    ("Площадь равна " + fig.area());

    fig = rectangle;
        System.out.println("Площадь равна " + fig.area());

    fig = triangle;
        System.out.println("Площадь равна " + fig.area());
    }
}