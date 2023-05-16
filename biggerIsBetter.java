import java.util.Scanner;

public class biggerIsBetter {
    public static void main (String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            int[] highest = new int[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = input.nextLine().split(" ");
                int[] nums = new int[inputStr.length];

                for (int j=0;j<inputStr.length;j++) {
                    nums[j] = Integer.parseInt(inputStr[j]);
                }

                highest[i] = nums[0];

                for (int c=1;c<nums.length;c++) {
                    if (nums[c]>highest[i]) {
                        highest[i] = nums[c];
                    }
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(highest[i]);
            }
        }
    }
}
