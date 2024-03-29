//Program 7: To find the length of the Given String
package javaTask8;

public class LengthOfString {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String msg = "Guvi Geek";
        int count = 0; // To count the characters in the given string
        for (char ch : msg.toCharArray())
            count++;
        // Prints the length of the given string without using inbuilt function
        System.out.println("Length of given string (" + msg + ") without using inbuilt function: " + count);
        // Prints the length of the given string by using inbuilt function
        System.out.println("Length of given string (" + msg + ") using inbuilt function: " + msg.length());
    }
}
