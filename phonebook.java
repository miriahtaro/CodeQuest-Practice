import java.util.Scanner;

public class phonebook {
    public static void main (String[]args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] formated = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] inputStr = in.nextLine().split(" ");

                String[] digits = inputStr[0].split("");

                String format = inputStr[1].toLowerCase();

                if (format.equals("parentheses")) {
                    formated[i] = "(" + digits[0] + digits[1] + digits[2] + ") " + digits[3]+digits[4]+digits[5] + "-" + digits[6]+digits[7]+digits[8]+digits[9];
                }
                else if (format.equals("dashes")) {
                    formated[i] = digits[0]+digits[1]+digits[2] + "-" + digits[3]+digits[4]+digits[5] + "-" + digits[6]+digits[7]+digits[8]+digits[9];
                }
                else if (format.equals("periods")) {
                    formated[i] = digits[0]+digits[1]+digits[2] + "." + digits[3]+digits[4]+digits[5] + "." + digits[6]+digits[7]+digits[8]+digits[9];
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(formated[i]);
            }
        }
    }
}
