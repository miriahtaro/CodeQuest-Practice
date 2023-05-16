import java.util.*;

public class chineseZodiac {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {

            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                int year = Integer.parseInt(in.nextLine());

                results[i] = Integer.toString(year);

                // Yin or Yang
                if (year % 2 == 0) {
                    results[i] += " Yang";
                }
                else {
                    results[i] += " Yin";
                }

                // Five Elements - Wood, Fire, Earth, Metal, Water
                int eNum = year - 4;
                eNum = eNum % 10;
                eNum /= 2;
                if (eNum == 0) {
                    results[i] += " Wood";
                }
                else if (eNum == 1) {
                    results[i] += " Fire";
                }
                else if (eNum == 2) {
                    results[i] += " Earth";
                }
                else if (eNum == 3) {
                    results[i] += " Metal";
                }
                else if (eNum == 4) {
                    results[i] += " Water";
                }

                // 12 Animals
                String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
                int aNum = year - 4;
                aNum = aNum % 12;
                results[i] += " " + animals[aNum];
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
