import java.util.Scanner;

public class factorial {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            long[] results = new long[testCases];

            for (int i=0;i<testCases;i++) {
                int num = Integer.parseInt(in.nextLine());

                results[i] = num;

                for (int j=(num-1);j>0;j--) {
                    results[i] *= j;
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
