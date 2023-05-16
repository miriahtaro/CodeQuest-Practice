import java.util.*;

public class isItHotInHere {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            ArrayList<String> results = new ArrayList<String>();

            for (int i=0;i<testCases;i++) {
                int cases = Integer.parseInt(in.nextLine());

                for (int c=0;c<cases;c++) {
                    String[] inputStr = in.nextLine().split(" ");

                    Double temp = Double.parseDouble(inputStr[0]);
                    char meas = inputStr[1].charAt(0);

                    

                    Double newT = 0.0;
                    char newMeas = 'C';
                    if (meas == 'C') {
                        newT = temp * 1.8 + 32;
                        newMeas = 'F';
                    }
                    else if (meas == 'F') {
                        newT = (temp - 32) * (0.5555555555555);
                        newMeas = 'C';
                    }

                    results.add(inputStr[0] + " " + inputStr[1] + " = " + String.format("%.1f", newT) + " " + Character.toString(newMeas));
                }
            }

            for (int i=0;i<results.size();i++) {
                System.out.println(results.get(i));
            }
        }
    }
}
