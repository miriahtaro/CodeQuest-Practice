import java.util.*;

public class findTheMissingSensor {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            int[] results = new int[testCases];

            for (int i=0;i<testCases;i++) {
                int N = Integer.parseInt(in.nextLine());
                String [] inputStr = in.nextLine().split(" ");
                int [] nums = new int[inputStr.length];

                for (int j=0;j<inputStr.length;j++) {
                    nums[j] = Integer.parseInt(inputStr[j]);
                }

                for (int j=1;j<=N;j++) {
                    boolean check = false;
                    for (int c=0;c<nums.length;c++) {
                        if (nums[c] == j) {
                            check = true;
                        }
                    }

                    if (check == false) {
                        results[i] = j;
                    }
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
