import java.util.*;

public class thatsOdd {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];
            for (int i=0;i<testCases;i++) {
                int num = Integer.parseInt(in.nextLine());
                if (num % 2 == 0) {
                    results[i] = "EVEN";
                }
                else {
                    results[i] = "ODD";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
