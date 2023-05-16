import java.util.*;

public class quickReading {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] words = in.nextLine().split(" ");

                char[] wordOne = words[0].toCharArray();
                char[] wordTwo = words[1].toCharArray();
                Arrays.sort(wordOne);
                Arrays.sort(wordTwo);

                boolean match = true;
                for (int j=0;j<wordOne.length;j++) {
                    if (wordOne[j] != wordTwo[j]) {
                        match = false;
                    }
                }
                if (words[0].charAt(0) == words[1].charAt(0) && words[0].charAt(words[0].length() - 1) == words[1].charAt(words[1].length() - 1) && match == true && wordOne.length == wordTwo.length) {
                    results[i] = words[1];
                }
                else {
                    results[i] = words[0];
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
