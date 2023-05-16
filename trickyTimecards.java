import java.util.*;

public class trickyTimecards {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            ArrayList<String> results = new ArrayList<String>();
            ArrayList<String> names = new ArrayList<String>();
            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(",");

                names.add(inputStr[0]);

                int hours = 0;
                int minutes = 0;

                for (int j=1;j<6;j++) {
                    String[] time = inputStr[j].split(":");

                    hours += Integer.parseInt(time[0]);
                    minutes += Integer.parseInt(time[1]);
                }

                hours += (minutes/60);
                minutes = minutes % 60;

                String result = "";
                
                if (hours == 1) {
                    result += Integer.toString(hours) + " hour";
                }
                else {
                    result += Integer.toString(hours) + " hours";
                }
                
                if (minutes > 0) {
                    result += " " + Integer.toString(minutes) + " minute";
                    if (minutes != 1) {
                        result += "s";
                    }
                }
                

                results.add(result);
            }

            for (int i=0;i<results.size();i++) {
                System.out.println(names.get(i)+"="+results.get(i));
            }
        }
    }
}
