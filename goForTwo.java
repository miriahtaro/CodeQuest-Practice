import java.util.*;

public class goForTwo {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            int [] results = new int[testCases];

            for (int i=0;i<testCases;i++) {
                String[] scoresStr = in.nextLine().split(" ");
                int[] scores = new int[2];

                for (int j=0;j<2;j++) {
                    scores[j] = Integer.parseInt(scoresStr[j]);
                }

                int d = scores[0] - scores[1];
                
                if (d == -15 || d==-13 || d==-11 || d==-10 || d==-8 || d==-5 || d==-4 || d==-2 || d==1 || d==5 || d==12) {
                    results[i] = 2;
                } 
                else {
                    results[i] = 1;
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
