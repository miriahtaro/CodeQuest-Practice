import java.util.*;

public class theGoodShipInput {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            ArrayList<String> results = new ArrayList<String>();

            for (int i=0;i<testCases;i++) {
                String[] countsStr = in.nextLine().split(" ");
                int[] counts = new int[2];

                for (int j=0;j<2;j++) {
                    counts[j] = Integer.parseInt(countsStr[j]);
                }

                String [] database = new String[counts[0]];
                String [] reports = new String[counts[1]];
                for (int d=0;d<database.length;d++) {
                    database[d] = in.nextLine();
                }
                for (int r=0;r<reports.length;r++) {
                    reports[r] = in.nextLine();
                }
                System.out.println("wwww" + database[database.length - 1]);
                System.out.println("wwww" + reports[reports.length - 1]);


                for (int d=0;d<database.length;d++) {
                    boolean check = false;
                    for (int r=0;r<reports.length;r++) {
                        if (database[d].equals(reports[r])) {
                            check = true;
                        }
                    }
                    if (check == false) {
                        results.add(database[d]);
                    }
                }
            }

            for (int i=0;i<results.size();i++) {
                System.out.println(results.get(i));
            }
        }
    }
}
