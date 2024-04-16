//Program 4: To Convert list to array
package javaTask12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListToArray {
    public static void main(String[] args) {
        // Declaring variable for the array list
        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // Lets add 5 Strings in the Arraylist
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a String");
            al.add(i, sc.next());
        }
        sc.close();
        // Print the Arraylist
        System.out.println("\nElements of Arraylist:");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + "  ");

        }
        // Convert list to Array
        String[] arr = al.toArray(new String[al.size()]);
        // Print the Array
        System.out.println("\n\nElements of Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
