import java.util.*;

public class monogram {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            ArrayList<String> results = new ArrayList<String>();

            for (int i=0;i<testCases;i++) {
                int cases = Integer.parseInt(in.nextLine());

                for (int j=0;j<cases;j++) {
                    String[] inputStr = in.nextLine().toUpperCase().split(" ");
                    String result = String.valueOf(inputStr[0].charAt(0)) + String.valueOf(inputStr[2].charAt(0)) + String.valueOf(inputStr[1].charAt(0));
                    results.add(result);
                }
            }

            for (int i=0;i<results.size();i++) {
                System.out.println(results.get(i));
            }
        }
    }
}
