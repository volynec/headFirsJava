package app3;

/**
 * Created by user on 09.12.2016.
 */
public class Rectangle extends Square {
    int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return this.getHeight() * this.getWidth();
    }
}
