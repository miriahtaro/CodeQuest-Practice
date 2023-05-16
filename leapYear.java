import java.util.Scanner;
import java.util.ArrayList;

public class leapYear {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            ArrayList<String> results = new ArrayList<String>();

            for (int i=0;i<testCases;i++) {
                int amtYears = Integer.parseInt(in.nextLine());

                for (int j=0;j<amtYears;j++) {
                    int year = Integer.parseInt(in.nextLine());

                    if (year < 1582) {
                        results.add("No");
                    }
                    else if (year % 4 != 0) {
                        results.add("No");
                    }
                    else if (year % 100 != 0) {
                        results.add("Yes");
                    }
                    else if (year % 400 != 0) {
                        results.add("No");
                    }
                    else {
                        results.add("Yes");
                    }
                }
            }

            for (int i=0;i<results.size();i++) {
                System.out.println(results.get(i));
            }
        }
    }
}
