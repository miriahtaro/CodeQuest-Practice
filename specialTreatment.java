import java.util.*;

public class specialTreatment {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {

                results[i] = "";
                String[] inputStr = in.nextLine().split("");
                
                for (int j=0;j<inputStr.length;j++) {
                    if (Character.isAlphabetic(inputStr[j].charAt(0)) || Character.isDigit(inputStr[j].charAt(0)) || inputStr[j].equals(" ")) {
                        results[i] += inputStr[j];
                    }
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
