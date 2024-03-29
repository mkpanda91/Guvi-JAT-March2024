//Program 10: To count the number of digits in an integer
package javaTask8;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        // Num is declared to accept the user input number. Count is used to calculate
        // the number of digits in number Num
        long num, long_num;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        // Accepting Integer through User input
        System.out.println("Please enter an Integer value");
        num = sc.nextInt();
        long_num = num;
        while (long_num != 0) {
            long_num = long_num / 10;
            count++;
        }
        System.out.println("The number of digits in " + num + " = " + count);
        sc.close();
    }

}
