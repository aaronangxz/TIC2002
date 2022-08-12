public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle(){
        this(0, 0, 0);
    }

    public Circle(int x, int y, double radius){
        setX(x);
        setY(y);
        this.radius = radius; //TODO: You need to update this line too
    }

    //TODO: Add your code here

    public int getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return (int)area;
    }

}
