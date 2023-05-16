import java.util.*;

public class mirrorMirror {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String [] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] str = in.nextLine().split("");
                results[i] = "";

                for (int j=0;j<str.length;j++) {
                    results[i] += str[str.length - (j+1)];
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
