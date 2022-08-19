package Coursemology.week3.MainW3E3;

import java.util.Arrays;

public class MainW3E3 {
    public static String[] filterEmails(String[] items){
        String[] results = new String[items.length];
        int matchCount = 0;
        for(String item: items){
            if (item.contains("@")){
                results[matchCount] = item;
                matchCount++;
            }
        }
        return Arrays.copyOf(results, matchCount);
    }

    public static void printItems(String[] items) {
        //TODO: Add your code here
        System.out.println(Arrays.toString(items));
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printItems(filterEmails(new String[]{}));
        printItems(filterEmails(new String[]{"abc"}));
        printItems(filterEmails(new String[]{"adam@example.com", "aab", "john@example.com", "some@"}));
        printItems(filterEmails(new String[]{"xyz", "@bee.com", "aab"}));
    }
}