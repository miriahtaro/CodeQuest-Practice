import java.util.Scanner;

public class addiply {
    public static void main (String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            int[][] answers = new int[testCases][2];

            for (int i=0;i<testCases;i++) {
                String[] intsStr = input.nextLine().split(" ");
                int[] nums = new int[2];

                for (int j=0;j<2;j++) {
                    nums[j] = Integer.parseInt(intsStr[j]);
                }

                answers[i][0] = nums[0] + nums[1];
                answers[i][1] = nums[0] * nums[1];
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(answers[i][0] + " " + answers[i][1]);
            }
        }
    }
}
