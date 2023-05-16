import java.util.*;

public class anagram {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String input = in.nextLine();
                String[] inputStr = input.split("|");

                char[] wordOne = inputStr[0].toCharArray();
                char[] wordTwo = inputStr[1].toCharArray();
                Arrays.sort(wordOne);
                Arrays.sort(wordTwo);

                boolean match = true;
                for (int j=0;j<wordOne.length;j++) {
                    if (wordOne[j] != wordTwo[j]) {
                        match = false;
                    }
                }

                results[i] = input;

                if (match == true) {
                    results[i] += " = ANAGRAM";
                }
                else if (match == false) {
                    results[i] += " = NOT AN ANAGRAM";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }

        }
    }
}
