import java.util.Scanner;

public class brickHouse {
    public static void main (String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = input.nextLine().split(" ");
                int[] nums = new int[3];

                for (int j=0;j<3;j++) {
                    nums[j] = Integer.parseInt(inputStr[j]);
                }

                if (nums[0] + (nums[1] * 5) >= nums[2]) {
                    results[i] = "true";
                }
                else {
                    results[i] = "false";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
