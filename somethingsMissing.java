import java.util.*;

public class somethingsMissing {
    public static void main(String[]args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            StringBuilder [] results = new StringBuilder[testCases];

            for (int i=0;i<testCases;i++) {
                String inputStr[] = in.nextLine().split(" ");
                StringBuilder word = new StringBuilder(inputStr[0]);
                int remove = Integer.parseInt(inputStr[1]);
                word.delete(remove, remove+1);

                results[i] = word;
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
