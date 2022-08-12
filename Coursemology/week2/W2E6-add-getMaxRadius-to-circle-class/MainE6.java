//WARNING: Do not change the code of this class
public class MainE6 {
    public static void main(String[] args) {
        CircleE6 c = new CircleE6();
        System.out.println("max radius used so far : " + CircleE6.getMaxRadius());
        c = new CircleE6(0, 0, 10);
        System.out.println("max radius used so far : " + CircleE6.getMaxRadius());
        c = new CircleE6(0, 0, -15);
        System.out.println("max radius used so far : " + CircleE6.getMaxRadius());
        c.setRadius(12);
        System.out.println("max radius used so far : " + CircleE6.getMaxRadius());
    }
}