import java.util.Scanner;

public class animalFarm {
    public static void main (String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            int[] legs = new int[testCases];
            for (int i=0;i<testCases;i++) {
                String[] inputStr = input.nextLine().split(" ");
                int[] nums = new int[3];

                for (int j=0;j<3;j++) {
                    nums[j] = Integer.parseInt(inputStr[j]);
                }

                legs[i] = 0;
                legs[i] += nums[0] * 2;
                legs[i] += nums[1] * 4;
                legs[i] += nums[2] * 4;
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(legs[i]);
            }
        }
    }
}
