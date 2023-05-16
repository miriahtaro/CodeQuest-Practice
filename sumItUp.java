import java.util.Scanner;

public class sumItUp {
    public static void main (String[]args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            int[] sums = new int[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");
                int[] nums = new int[2];

                for (int j=0;j<2;j++) {
                    nums[j] = Integer.parseInt(inputStr[j]);
                }

                if (nums[0] == nums[1]) {
                    sums[i] = 2 * (nums[0] + nums[1]);
                }
                else {
                    sums[i] = (nums[0] + nums[1]);
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(sums[i]);
            }
        }
    }
}
