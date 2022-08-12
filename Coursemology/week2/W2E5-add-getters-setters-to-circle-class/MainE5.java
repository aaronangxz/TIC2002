//WARNING: Do not change the code of this class
public class MainE5 {
    public static void main(String[] args) {
        CircleE5 c = new CircleE5(1,2, 5);

        c.setX(4);
        c.setY(5);
        c.setRadius(6);
        System.out.println("x      : " + c.getX());
        System.out.println("y      : " + c.getY());
        System.out.println("radius : " + c.getRadius());
        System.out.println("area   : " + c.getArea());

        c.setRadius(-5);
        System.out.println("radius : " + c.getRadius());
        c = new CircleE5(1, 1, -4);
        System.out.println("radius : " + c.getRadius());

    }
}
