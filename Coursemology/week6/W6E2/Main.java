package Coursemology.week6.W6E2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static HashMap<String, Integer> roster = new HashMap<>();

    //TODO: Add your code here
    private static void addToRoster(String day) {
        if (roster.containsKey(day)){
            Integer newValue = Integer.valueOf(roster.get(day).intValue() + 1);
            roster.put(day, newValue);
        } else {
            roster.put(day, Integer.valueOf(1));
        }
    }

    private static void printRoster() {
        for (String i : roster.keySet()) {
            System.out.println(i + " => " + roster.get(i));
        }
    }

    //WARNING: Do not change the code below
    public static void main(String[] args) {
        addToRoster("Monday"); // i.e., one person signed up for Monday
        addToRoster("Wednesday"); // i.e., one person signed up for Wednesday
        addToRoster("Wednesday"); // i.e., another person signed up for Wednesday
        addToRoster("Friday");
        addToRoster("Monday");
        printRoster();
    }

}