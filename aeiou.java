import java.util.Scanner;

public class aeiou {
    public static void main (String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            int[] answers = new int[testCases];

            for (int i=0;i<testCases;i++) {
                String letters = input.nextLine();
                answers[i] = 0;
                for (int j=0;j<letters.length();j++) {
                    if (letters.charAt(j)=='a' || letters.charAt(j)=='e' || letters.charAt(j)=='i' || letters.charAt(j)=='o' || letters.charAt(j)=='u') {
                        answers[i] += 1;
                    }
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(answers[i]);
            }
        }
    }
}
