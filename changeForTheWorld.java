import java.util.Scanner;

public class changeForTheWorld {
    public static void main (String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            int[][] coins = new int[testCases][4];
            String[] amt = new String[testCases];

            for (int i=0;i<testCases;i++) {
                int cents = 0;
                String inputStr = input.nextLine();
                
                StringBuilder moneyBuilder = new StringBuilder(inputStr);
                moneyBuilder.deleteCharAt(0);

                String moneyStr = moneyBuilder.toString();
                amt[i] = moneyStr;

                cents = (int) (Double.parseDouble(moneyStr) * 100);

                coins[i][0] = cents/25;
                cents -= (coins[i][0] * 25);
                coins[i][1] = cents/10;
                cents -= (coins[i][1] * 10);
                coins[i][2] = cents/5;
                cents -= (coins[i][2]*5);
                coins[i][3] = cents;
            }

            for (int i=0;i<testCases;i++) {
                System.out.println("$"+amt[i]);
                System.out.println("Quarters=" + Integer.toString(coins[i][0]));
                System.out.println("Dimes=" + Integer.toString(coins[i][1]));
                System.out.println("Nickels=" + Integer.toString(coins[i][2]));
                System.out.println("Pennies=" + Integer.toString(coins[i][3]));
            }
        }
    }
}