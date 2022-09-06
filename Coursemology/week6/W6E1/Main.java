package Coursemology.week6.W6E1;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> numbers = new ArrayList<>();

    private static void addNumber(int i) {
        numbers.add(Integer.valueOf(i));
        System.out.println(numbers);
    }

    private static void removeNumber(int n) {
        numbers.remove(getIdx(n));
        System.out.println(numbers);
    }

    private static int getTotal() {
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        return total;
    }

    private static boolean isFound(int n) {
        return getIdx(n) != -1;
    }

    private static int getIdx(int n) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == n){
                return i;
            }
        }
        return -1;
    }

    //WARNING: Do not change the code below
    public static void main(String[] args) {
        System.out.println("Adding numbers to the list");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        System.out.println("The total is: " + getTotal());
        System.out.println("8 in the list : " + isFound(8) );
        System.out.println("5 in the list : " + isFound(5) );
        removeNumber(8);
        System.out.println("The total is: " + getTotal());
    }

}
