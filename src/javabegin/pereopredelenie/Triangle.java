package javabegin.pereopredelenie;

/**
 * Created by user on 01.11.2016.
 */
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределяем метод
    @Override
    double area() {
        System.out.println("Площадь треугольника");
        return dim1 * dim2 / 2;
    }
}