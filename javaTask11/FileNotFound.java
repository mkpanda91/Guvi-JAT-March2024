//Program 8: Display error message to user for FileNotFoundException
package javaTask11;

import java.io.*;

public class FileNotFound {
    public static void main(String[] args) {
        // Declare object of FileInputStream class
        FileInputStream fis;
        try {
            // Initializing object of FileInputStream class with the file path as argument
            fis = new FileInputStream(
                    "C://Users//Mahesh//Downloads//Guvi//Guvi_Java-Assignments//javaTask11//writefile.txt");
            // Returns the number of remaining bytes that can be read from the input stream
            byte[] byteArray = new byte[fis.available()];
            // Reads a byte of data from the input stream
            fis.read(byteArray);
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println();
            System.out.println(e.getClass().getSimpleName()+" : "+ "The file required to perform Read operation does not exist.");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
