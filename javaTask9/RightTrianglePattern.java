/*Program 3: To print the following pattern, if input is 4 and likewise
1
2 3
4 5 6
7 8 9 10
*/
package javaTask9;

import java.util.Scanner;

public class RightTrianglePattern {
    // User defined function to implement the logic and print the pattern
    public static void printPattern(int r) {
        // Variable to print the numbers in the pattern
        int num = 1;
        System.out.println("Number Pattern is as follows: ");
        // Outer loop to implement the row structure for the pattern
        for (int i = 0; i < r; i++) {
            // Inner loop to implement the column structure for the pattern
            for (int j = 0; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Variable declaration to accept user input for number of rows
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows needed in the pattern");
        row = sc.nextInt();
        System.out.println();
        // calling the user defined function
        if (row == 0)
            System.out.println("No Pattern will be printed. Please enter value greater than Zero to see a pattern");
        else
            printPattern(row);
        sc.close();

    }

}
