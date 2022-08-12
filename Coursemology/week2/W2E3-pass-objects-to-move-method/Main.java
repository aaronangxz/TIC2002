import java.awt.Point;
import java.awt.Rectangle;

public class Main {

    //TODO: add your method here

    public static void main(String[] args) {
        // WARNING: Do not change the code of this method
        Point p1 = new Point(0, 0);
        Rectangle r1 = new Rectangle(2, 3, 5, 6);
        System.out.println("arguments: " + p1 + ", " + r1);

        Point p2 = move(p1, r1);
        System.out.println(
                "argument point after method call: " + p1);
        System.out.println(
                "argument rectangle after method call: " + r1);
        System.out.println(
                "returned point: " + p2);

        System.out.println(move(null, null));
    }
}
