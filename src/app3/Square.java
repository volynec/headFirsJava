package app3;

/**
 * Created by user on 09.12.2016.
 */
public class Square {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return this.width * this.width;
    }
}
