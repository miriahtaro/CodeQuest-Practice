import java.util.*;

public class roundEmUp {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            int[][] results = new int[testCases][3];

            for (int i=0;i<testCases;i++) {
                String inputStr[] = in.nextLine().split(" ");
                int inputNums[] = new int[3];

                for (int j=0;j<3;j++) {
                    inputNums[j] = Integer.parseInt(inputStr[j]);

                    if (inputNums[j] % 2 == 0) {
                        results[i][j] = inputNums[j] + 2;
                    }

                    else {
                        results[i][j] = inputNums[j] + 1;
                    }
                }
            }

            for (int i=0;i<testCases;i++) {
                for (int j=0;j<2;j++) {
                    System.out.print(results[i][j] + " ");
                }
                System.out.print(results[i][2]);
                System.out.println();
            }
        }
    }
}
