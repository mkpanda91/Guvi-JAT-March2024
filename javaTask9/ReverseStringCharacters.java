//Program 2: To Reverse the characters in the string and print it
package javaTask9;

import java.util.Scanner;

public class ReverseStringCharacters {
    public static void main(String[] args) {
        // Declaration of variables to store the initial input string by user and the
        // reverse string
        String inputString, reverseString = "";
        Scanner sc = new Scanner(System.in);
        // Reading the input string from the user
        System.out.println("Please enter the input string");
        inputString = sc.nextLine();
        // Variable declared and initialized with the length of the input string
        int length = inputString.length();
        // Using while loop to fetch the reverse string
        int i = length - 1;
        while (i >= 0) {
            reverseString = reverseString + inputString.charAt(i);
            i--;
        }
        System.err.println();
        System.out.println("Input String is: " + inputString);
        System.out.println("Reverse of string is: " + reverseString);

        sc.close();
    }
}
