public class CircleE5 {
    private int x;
    private int y;
    private double radius;

    public CircleE5(){
        this(0, 0, 0);
    }

    public CircleE5(int x, int y, double radius){
        setX(x);
        setY(y);
        setRadius(radius); //TODO: You need to update this line too
    }

    //TODO: Add your code here

    public int getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return (int)area;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setX(int x) {
        this.x = Math.max(x, 0);
    }

    public int getX() {
        return this.x;
    }
    public void setY(int y) {
        this.y = Math.max(y, 0);
    }

    public int getY() {
        return this.y;
    }


}
