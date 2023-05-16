import java.util.*;

public class noMoreShouting {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String [] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String input = in.nextLine();
                results[i] = input.toLowerCase();
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
