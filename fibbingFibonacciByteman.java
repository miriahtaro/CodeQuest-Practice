import java.util.*;

public class fibbingFibonacciByteman {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                int num = Integer.parseInt(in.nextLine());

                if (isPerfectSquare(5*num*num + 4) == true || isPerfectSquare(5*num*num - 4) == true) {
                    results[i] = "TRUE";
                }
                else {
                    results[i] = "FALSE";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }

    static boolean isPerfectSquare(int x) {
        int num = (int) Math.sqrt(x);
        return (num*num == x);
    }
}
