package javabegin.pereopredelenie;

/**
 * Created by user on 01.11.2016.
 */
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // Переопределяем метод
    @Override
    double area() {
        System.out.println("Площадь прямоугольника");
        return dim1 * dim2;
    }
}