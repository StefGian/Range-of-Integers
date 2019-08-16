package numbersinrange;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class NumbersInRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get L and R from the input
        int L = s.nextInt();
        int R = s.nextInt();

        // Write here the logic to print all integers between L and R
        for (int i = L; i <= R; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        s.close();
    }

}
