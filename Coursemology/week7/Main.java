package Coursemology.week7;

public class Main {

    //TODO: Add your code here
    public static void describe(String color, Priority p) {
        switch (p) {
            case LOW:
                System.out.println(color + " indicates low priority");
                break;
            // ...
        }
    }
    //WARNING: Do not change the code below
    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}