import java.util.*;

public class locationSortation {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            ArrayList<String> locations = new ArrayList<String>();

            for (int i=0;i<testCases;i++) {
                locations.add(in.nextLine());
            }

            Collections.sort(locations);

            for (int i=0;i<testCases;i++) {
                System.out.println(locations.get(i));
            }
        }
    }
}
