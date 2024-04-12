//Program 5.b : To display the scenario of "String Index Out of Bounds exception"
package javaTask11;

public class StringIndexOutOfBounds {
    public static void main(String[] args) {
        // Initializing the string variable
        String str = "Thank you Guvi";
        // Trying to access character within the string at an index outside of limit to
        // see the "String Index Out of Bounds exception"
        System.out.println(str.charAt(14));
    }
}
