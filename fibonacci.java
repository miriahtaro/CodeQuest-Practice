import java.util.Scanner;

public class fibonacci {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            long[] sequence = new long[90];

            sequence[0] = 0;
            sequence [1] = 1;

            for (int i=2;i<90;i++) {
                sequence[i] = sequence[i-2] + sequence[i-1];
            }

            long[] results = new long[testCases];
            int[] positions = new int[testCases];

            for (int i=0;i<testCases;i++) {
                positions[i] = Integer.parseInt(in.nextLine());
                results[i] = sequence[positions[i] - 1];
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(positions[i] + " = " + results[i]);
            }
        }
    }
}
