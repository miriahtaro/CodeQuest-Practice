import java.util.Scanner;

public class sayLockheedMartin {
    public static void main (String[]args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String [] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                int num = Integer.parseInt(in.nextLine());

                if (num % 3 == 0 && num % 7 ==0) {
                    results[i] = "LOCKHEEDMARTIN";
                }
                else if (num % 3 == 0) {
                    results[i] = "LOCKHEED";
                }
                else if (num % 7 ==0) {
                    results[i] = "MARTIN";
                }
                else {
                    results[i] = Integer.toString(num);
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
