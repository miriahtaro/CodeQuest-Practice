import java.util.*;

public class sortNumbers {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] numsStr = in.nextLine().split(",");
                int[] nums = new int[numsStr.length];

                for (int j=0;j<numsStr.length;j++) {
                    nums[j] = Integer.parseInt(numsStr[j]);
                }

                Arrays.sort(nums);

                results[i] = Integer.toString(nums[0]) + ",";
                for (int c=1;c<nums.length - 1;c++) {
                    results[i] += Integer.toString(nums[c]) + ",";
                }
                results[i] += Integer.toString(nums[nums.length - 1]);
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}