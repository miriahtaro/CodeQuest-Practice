import java.util.*;

public class easterSunday {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            String[] results = new String[testCases];
            for (int i=0;i<testCases;i++) {
                int y = Integer.parseInt(in.nextLine());

                int a = y%19;
                int b = y%4;
                int c = y%7;
                int k = (int) Math.floor(y/100);
                int p = (int) Math.floor((13+(8*k))/25);
                int q = (int) Math.floor(k/4);
                int m = (15 - p + k - q)%30;
                int n = (4 + k - q)%7;
                int d = (19 * a + m)%30;
                int e = (2*b + 4*c + 6*d + n)%7;
                int f = (11*m + 11)%30;

                int date = 22 + d + e;
                int month = 0;
                if (date <= 31) {
                    month = 3;
                }
                else {
                    month = 4;
                    date -= 31;
                }

                if (month == 4 && date == 25 && d == 28 && e == 6 && f < 19) {
                    date = 18;
                }
                if (month == 4 && date == 26 && d == 29 && e == 6) {
                    date = 19;
                }

                results[i] = Integer.toString(y) + "/0" + Integer.toString(month);

                if (date < 10) {
                    results[i] += "/0" + Integer.toString(date);
                }
                else {
                    results[i] += "/" + Integer.toString(date);
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
