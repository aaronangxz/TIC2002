//WARNING: Do not change the code below
package Coursemology.week4.W4E3;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public int area() {
        return height * width;
    }
}