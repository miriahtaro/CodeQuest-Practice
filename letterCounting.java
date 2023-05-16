import java.util.*;

public class letterCounting {
    public static void main (String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            int[] lengths = new int[testCases];

            for (int i=0;i<testCases;i++) {
                lengths[i] = input.nextLine().length();
                lengths[i] += 1;
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(lengths[i]);
            }
        }
    }
}
