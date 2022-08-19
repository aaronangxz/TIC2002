import java.util.Arrays;

public class Main {
    public static String[] filterEmails(String[] items) {
        //TODO: Add your code here
    }

    public static void printItems(String[] items) {
        //TODO: Add your code here
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printItems(filterEmails(new String[]{}));
        printItems(filterEmails(new String[]{"abc"}));
        printItems(filterEmails(new String[]{"adam@example.com", "aab", "john@example.com", "some@"}));
        printItems(filterEmails(new String[]{"xyz", "@bee.com", "aab"}));
    }
}