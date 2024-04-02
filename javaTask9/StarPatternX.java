/*Program 4: To print the following pattern, if input is 5 and likewise
*   *
 * *
  *
 * *
*   *
*/
package javaTask9;

import java.util.Scanner;

public class StarPatternX {
    public static void main(String[] args) {
        // Variable declaration to accept user input for number of rows
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows needed in the pattern");
        row = sc.nextInt();
        System.out.println();
        System.out.println("Required Pattern is as follows: ");
        // Outer loop to implement the rows needed in the X star pattern
        for (int i = 1; i <= row; i++) {
            // Inner loop to implement the columns needed in the X star pattern
            for (int j = 1; j <= row; j++) {
                // First part of if condition takes care of printing '*' and second part takes
                // care of the the spaces
                if (j == i || j == row - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
