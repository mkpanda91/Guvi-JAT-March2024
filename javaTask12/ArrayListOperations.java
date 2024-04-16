// Program 2: Create Arraylist of string and then remove all the elements from it
package javaTask12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
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
        // Remove the elements from the Arraylist
        al.clear();
        // Now check the Arraylist elements
        System.out.println("\n\nElements of Arraylist After Removal of elements:");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + "  ");
        }
    }
}
