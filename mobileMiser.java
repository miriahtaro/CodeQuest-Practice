import java.util.*;

public class mobileMiser {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            double [][] results = new double[testCases][4];

            for (int i=0;i<testCases;i++) {
                StringBuilder input = new StringBuilder(in.nextLine());
                input.deleteCharAt(0);

                String inputStr = input.toString();
                Double amt = Double.parseDouble(inputStr);

                results[i][0] = amt;
                results[i][1] = 0.15 * amt;
                results[i][2] = 0.18 * amt;
                results[i][3] = 0.20 * amt;

            }

            for (int i=0;i<testCases;i++) {
                System.out.println("Total of the bill: " + "$" + String.format("%.2f", results[i][0]));
                System.out.println("15% = $" + String.format("%.2f", results[i][1]));
                System.out.println("18% = $" + String.format("%.2f", results[i][2]));
                System.out.println("20% = $" + String.format("%.2f", results[i][3]));
            }
        }
    }
}
