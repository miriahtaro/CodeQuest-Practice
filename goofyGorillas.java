import java.util.*;

public class goofyGorillas {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] input = in.nextLine().split(" ");

                if (input[0].equals(input[1])) {
                    results[i] = "true";
                }
                else {
                    results[i] = "false";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }

            
        }
    }
}
