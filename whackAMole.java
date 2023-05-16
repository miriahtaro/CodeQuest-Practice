import java.util.*;

public class whackAMole {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");
                results[i] = "";
                for (int j=0;j<inputStr.length;j++) {
                    if (inputStr[j].equals("M")) {
                        if (results[i].equals("")) {
                            results[i] += Integer.toString((j+1));
                        }
                        else {
                            results[i] += " " + Integer.toString((j+1));
                        }
                    }
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
