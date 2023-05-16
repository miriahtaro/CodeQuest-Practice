import java.util.Scanner;

public class caughtSpeeding {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");

                int speed = Integer.parseInt(inputStr[0]);

                int firstO = 60;
                int secondO = 80;

                if (inputStr[1].equals("true")) {
                    firstO += 5;
                    secondO += 5;
                }

                if (speed <= firstO) {
                    results[i] = "no ticket";
                }

                else if (speed > firstO && speed <= secondO) {
                    results[i] = "small ticket";
                }

                else {
                    results[i] = "big ticket";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
