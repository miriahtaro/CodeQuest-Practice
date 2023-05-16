import java.util.*;
import java.text.DecimalFormat;

public class divideByZero {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");
                if (Character.isAlphabetic(inputStr[0].charAt(0)) == true)  {
                    results[i] = "Invalid Dividend";
                }
                else if (Character.isAlphabetic(inputStr[1].charAt(0)) == true) {
                    results[i] = "Invalid Divisor";
                }

                else if (inputStr[1].charAt(0) == '0') {
                    results[i] = "Divide By Zero";
                }

                else {
                    Double num1 = Double.parseDouble(inputStr[0]);
                    Double num2 = Double.parseDouble(inputStr[1]);

                    DecimalFormat df = new DecimalFormat("#.#");
                    results[i] = df.format(num1 / num2);
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
