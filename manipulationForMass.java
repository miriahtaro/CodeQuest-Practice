import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class manipulationForMass {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            Double[] results = new Double[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");
                Double[] input = new Double[2];

                for (int j=0;j<2;j++) {
                    input[j] = Double.parseDouble(inputStr[j]);
                }

                Double mass = input[0] * input[1];
                DecimalFormat df = new DecimalFormat("0.00");
                df.setRoundingMode(RoundingMode.HALF_EVEN);
                results[i] = Double.parseDouble(df.format(mass));
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(String.format("%.2f", results[i]));
            }
        }
    }
}
