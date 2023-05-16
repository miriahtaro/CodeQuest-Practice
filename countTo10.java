import java.util.*;

public class countTo10 {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            ArrayList<Integer> bin = new ArrayList<Integer>();
            for (int i=0;i<testCases;i++) {
                int num = Integer.parseInt(in.nextLine());
                int max = 2^num;

                for (int j=0;j<max;j++) {
                    
                }
            }
        }
    }
}
