import java.util.*;

public class positiveNegative {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];
            for (int i=0;i<testCases;i++) {
                int num = Integer.parseInt(in.nextLine());

                if (num < 0) {
                    results[i] = "NEGATIVE";
                }
                else {
                    results[i] = "POSITIVE";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
