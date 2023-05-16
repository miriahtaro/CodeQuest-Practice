import java.util.Scanner;

public class passFail {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String [] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                int score = Integer.parseInt(in.nextLine());

                if (score >= 70) {
                    results[i] = "PASS";
                }

                else {
                    results[i] = "FAIL";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
