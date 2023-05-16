import java.util.*;

public class leakLoss {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            int[] results = new int[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");
                int[] inputNums = new int[3];

                for (int j=0;j<3;j++) {
                    inputNums[j] = Integer.parseInt(inputStr[j]);
                }

                int difference = inputNums[1] - inputNums[2];
                results[i] = (inputNums[0] / difference) * inputNums[2];
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(Integer.toString(results[i]));
            }
        }
    }
}
