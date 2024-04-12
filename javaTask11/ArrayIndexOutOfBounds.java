//Program 5.a : To display the scenario of "Array Index Out of Bounds exception"
package javaTask11;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        // Initializing the array with 4 values
        int[] arr = { 2, 3, 5, 7 };
        // Trying to access value at 4th index to see the "Array Index Out of Bounds
        // exception"
        System.out.println(arr[4]);
    }
}
