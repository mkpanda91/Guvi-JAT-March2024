//Program 6: Exception handling for Incorrect password during login
package javaTask11;
import java.util.Scanner;
//By extending Exception class custom exceptions can be created
public class IncorrectPasswordException extends Exception{
    
        //To set the title/message for the custom exception
        public IncorrectPasswordException(String expceptionMessage){
            super(expceptionMessage);
        }
        // Login method to check if the entered password is correct
        @SuppressWarnings("unused")
        public static void login() throws IncorrectPasswordException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your username ");
            String username = scanner.nextLine();
            System.out.println("Please enter your password ");
            String password = scanner.nextLine();
            scanner.close();
            System.out.println();
            if(password.equals("Welcome2Guvi")){
                System.out.println("Password is correct. You are now being logged in");
            }
            else{
                throw new IncorrectPasswordException("Incorrect Passowrd entered for login");
            }
        }
    
        public static void main(String []args) {
    
            try {
                login();
            } catch (IncorrectPasswordException e) {
                System.out.println(e.getMessage());
            }
        } 
    }