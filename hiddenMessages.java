import java.util.*;

public class hiddenMessages {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine()) - 1;

            String[] key = in.nextLine().split("");
            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");

                results[i] = "";

                for (int j=0;j<inputStr.length;j++) {
                    String[] numsStr = inputStr[j].split("-");
                    int[] nums = new int[numsStr.length];

                    for (int c=0;c<numsStr.length;c++) {
                        nums[c] = Integer.parseInt(numsStr[c]);
                        results[i] += key[nums[c] - 1];
                    }

                    if (j<inputStr.length-1) {
                        results[i] += " ";
                    }
                }


            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
