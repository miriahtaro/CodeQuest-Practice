import java.util.*;

public class whatIsTheOperation {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] numsStr = in.nextLine().split(" ");
                int[] nums = new int[3];
                
                for (int j=0;j<3;j++) {
                    nums[j] = Integer.parseInt(numsStr[j]);
                }

                if (nums[0] + nums[1] == nums[2]) {
                    results[i] = "Addition";
                }
                else if (nums[0] - nums[1] == nums[2]) {
                    results[i] = "Subtraction";
                }
                else if (nums[0] * nums[1] == nums[2]) {
                    results[i] = "Multiplication";
                }
                else if (nums[0] / nums[1] == nums[2]) {
                    results[i] = "Division";
                }
                else if (nums[0] % nums[1] == nums[2]) {
                    results[i] = "Modulo";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
