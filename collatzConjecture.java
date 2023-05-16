import java.util.*;

public class collatzConjecture {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                int num = Integer.parseInt(in.nextLine());

                results[i] = Integer.toString(num);

                ArrayList<Integer> seq = new ArrayList<Integer>();

                while (num != 1) {
                    if (num % 2 == 0) {
                        seq.add(num / 2);
                        num/=2;
                    }
                    else {
                        seq.add(num*3 + 1);
                        num*=3;
                        num+=1;
                    }
                }

                results[i] += ":" + Integer.toString(seq.size() + 1);
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
