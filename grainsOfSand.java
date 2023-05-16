import java.util.*;
import java.math.BigInteger;

public class grainsOfSand {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            BigInteger [] results = new BigInteger[testCases];

            for (int i=0;i<testCases;i++) {
                results[i] = BigInteger.valueOf(0);
                int teams = Integer.parseInt(in.nextLine());
                for (int j=0;j<teams;i++) {
                    results[i].add(BigInteger.valueOf(Long.parseLong(in.nextLine())));
                }
                
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
