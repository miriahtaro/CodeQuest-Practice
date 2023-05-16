import java.util.Scanner;

public class imBoard {
    public static void main (String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            int[] dimensions = new int[testCases];

            for (int i=0;i<testCases;i++) {
                dimensions[i] = Integer.parseInt(input.nextLine());
            }
            for (int i=0;i<testCases;i++) {
                for (int l=0;l<dimensions[i];l++) {
                    System.out.print("#");
                    for (int w=1;w<dimensions[i];w++) {
                        System.out.print(" #");
                    }
                    System.out.println();
                }
            }
        }
    }
}