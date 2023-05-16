import java.util.*;

public class suffix {
    public static void main (String [] args) {
        try (Scanner in = new Scanner (System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split("th");
                int num = Integer.parseInt(inputStr[0]);

                if ((num%100) > 10 && (num%100) < 20) {
                    results[i] = Integer.toString(num) + "th";
                }
                else if (num % 10 == 1) {
                    results[i] = Integer.toString(num) + "st";
                }
                else if (num % 10 == 2) {
                    results[i] = Integer.toString(num) + "nd";
                }
                else if (num % 10 == 3) {
                    results[i] = Integer.toString(num) + "rd";
                }
                else {
                    results[i] = Integer.toString(num) + "th";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
