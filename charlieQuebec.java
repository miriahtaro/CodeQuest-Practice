import java.util.*;

public class charlieQuebec {
    public static void main (String [] args) {
        try (Scanner in = new Scanner (System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            ArrayList<String> results = new ArrayList<String>();
            String[] words = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "Xray", "Yankee", "Zulu"};

            for (int i=0;i<testCases;i++) {
                int lines = Integer.parseInt(in.nextLine());

                for (int j=0;j<lines;j++) {
                    String[] letters = in.nextLine().toUpperCase().split("");

                    String result = "";

                    for (int c=0;c<letters.length;c++) {

                        if (c>0) {
                            if (!letters[c-1].equals(" ") && !letters[c].equals(" ")) {
                                result += "-";
                            }
                        }
                        
                        if (letters[c].equals(" ")) {
                            result += " ";
                        }
                        else{
                            result += words[letters[c].charAt(0) - 65];

                            
                        }

                    }

                    results.add(result);
                }
            }

            for (int i=0;i<results.size();i++) {
                System.out.println(results.get(i));
            }
        }
    }
}
