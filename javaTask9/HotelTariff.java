//Program 6: To calculate the hotel tariff
package javaTask9;

import java.util.Scanner;

public class HotelTariff {
    public static void main(String[] args) {
        // Integer variables declared to store the Number of Month and Number of days
        // stayed in Hotel
        int monthNumber, days;
        // Floating variable declared to store the Hotel rent per day
        float hotelRent;
        Scanner sc = new Scanner(System.in);
        // Accepting and storing the user input
        System.out.println("Enter the Number of the month: 1 for January, 2 for February ... 12 for December");
        monthNumber = sc.nextInt();
        System.out.println("Enter the Hotel rent per day");
        hotelRent = sc.nextFloat();
        System.out.println("Enter the Number of days stayed in the Hotel");
        days = sc.nextInt();
        System.out.println();
        // Implementing switch case to calculate the Hotel Rent based on the Peak or Non
        // Peak season month
        switch (monthNumber) {
            case 12:
            case 11:
            case 6:
            case 5:
            case 4:
                hotelRent = ((float) (hotelRent + (0.20 * hotelRent))) * days;
                System.out.println("The Total Hotel rent is " + String.format("%.2f", hotelRent));
                break;
            case 10:
            case 9:
            case 8:
            case 7:
            case 3:
            case 2:
            case 1:
                hotelRent = hotelRent * days;
                System.out.println("The Total hotel rent is " + String.format("%.2f", hotelRent));
                break;
            default:
                System.out.println(
                        "Incorrect month number. Please enter the month Number between 1 to 12 (both included)");
                break;
        }
        sc.close();
    }
}
