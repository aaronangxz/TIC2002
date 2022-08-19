package Coursemology.week3.MainW3E4;

import java.util.Arrays;
import java.util.Scanner;

public class MainW3E4 {
    public static String[] filterAmounts(String sentence) {
        String[] words = sentence.split(" ");
        String[] result = new String[words.length];
        int wordCount = 0;
        for (String word : words) {
            if (word.startsWith("$")) {
                result[wordCount] = word;
                wordCount++;
            }
        }
        return Arrays.copyOf(result, wordCount);
    }

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Your expenses while overseas?");
        line = in.nextLine();

        String[] amounts = filterAmounts(line);
        System.out.println("Expenses in overseas currency:" + Arrays.toString(amounts));
        double total = 0;
        for (String amount : amounts) {
            amount = amount.replace("$","");
            total += Double.parseDouble(amount) * 1.7;
            // convert amount to double, multiply by currency conversion rate, and add to total
        }
        System.out.println("Total in local currency: $" + String.format("%.2f", total));

    }
}