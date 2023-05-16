import java.util.*;

public class robotPetsitter {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String [] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                int[] pos = new int[2];
                String[] movesStr = in.nextLine().split("");

                for (int j=0;j<movesStr.length;j++) {
                    if (movesStr[j].equals("L")) {
                        pos[0] -= 1;
                    }
                    else if (movesStr[j].equals("R")) {
                        pos[0] += 1;
                    }
                    else if (movesStr[j].equals("U")) {
                        pos[1] += 1;
                    }
                    else if (movesStr[j].equals("D")) {
                        pos[1] -= 1;
                    }
                }

                if (pos[0] == 0 && pos[1] == 0) {
                    results[i] = "TRUE";
                }
                else {
                    results[i] = "FALSE";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
