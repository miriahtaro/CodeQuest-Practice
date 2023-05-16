import java.util.*;

public class whoSellsMoreNewspapers {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");
                int[] nums = new int[2];

                for (int j=0;j<2;j++) {
                    nums[j] = Integer.parseInt(inputStr[j]);
                }

                if (nums[0] > nums[1]) {
                    results[i] = "Times has " + (nums[0] - nums[1]) + " more subscribers";
                }
                else if (nums[1] > nums[0]) {
                    results[i] = "Herald has " + (nums[1] - nums[0]) + " more subscribers";
                }
                else {
                    results[i] = "Times and Herald have the same number of subscribers";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
