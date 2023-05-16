import java.util.Scanner;

public class notSoSelfDriving {
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] speedsStr = input.nextLine().split(":");
                Double[] speeds = new Double[2];
                
                for (int j=0;j<2;j++) {
                    speeds[j] = Double.parseDouble(speedsStr[j]);
                }

                if (speeds[0] >= speeds[1]) {
                    results[i] = "SWERVE";
                }
                else if (speeds[0]*5 >= speeds[1]) {
                    results[i] = "BRAKE";
                }
                else {
                    results[i] = "SAFE";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}