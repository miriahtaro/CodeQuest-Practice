import java.util.*;

public class whatTriangleIsThis {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            String[] results = new String[testCases];

            for (int i=0;i<testCases;i++) {
                String[] lengthsStr = in.nextLine().split(", ");
                int [] lengths = new int[lengthsStr.length];

                for (int j=0;j<lengthsStr.length;j++) {
                    lengths[j] = Integer.parseInt(lengthsStr[j]);
                }

                if (lengths[0] + lengths[1] > lengths[2] && lengths[0] + lengths[2] > lengths[1] && lengths[1] + lengths[2] > lengths[0]) {
                    if (lengths [0] == lengths[1] && lengths[1] == lengths[2]) {
                        results[i] = "Equilateral";
                    }
                    else if (lengths[0] == lengths[1] || lengths[1] == lengths[2] || lengths[0] == lengths[2]) {
                        results[i] = "Isosceles";
                    }
                    else {
                        results[i] = "Scalene";
                    }
                }
                else {
                    results[i] = "Not a Triangle";
                }
            }

            for (int i=0;i<testCases;i++) {
                System.out.println(results[i]);
            }
        }
    }
}
