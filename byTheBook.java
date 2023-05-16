import java.util.*;

public class byTheBook {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];
            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split("");
                int[] digits = new int[inputStr.length];

                for (int j=0;j<inputStr.length;j++) {
                    if (inputStr[j].equals("X")) {
                        digits[j] = 10;
                    }
                    else {
                        digits[j] = Integer.parseInt(inputStr[j]);
                    } 
                }

                int sum = 0;

                for (int j=0;j<9;j++) {
                    sum += digits[j] * (10-j);
                }

                if (11 - (sum - 11*(sum/11)) == digits[9]) {
                    results[i] = "VALID";
                }
                else {
                    results[i] = "INVALID";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
