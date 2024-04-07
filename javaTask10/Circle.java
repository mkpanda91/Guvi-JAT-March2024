//Program 3: To calculate the circumference of a circle with implementation of constructors
package javaTask10;

import java.util.Scanner;

public class Circle {
    // Declaration of Data members of the Circle class
    public double r, d;

    // Construction with no parameters
    public Circle() {
        r = 0;
        d = 0;
    }

    // Parameterized constructors with 2 parameters
    public Circle(double r, double PI) {
        this.r = r;
        d = 2 * PI * r;
    }
}

class CircleMain {
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        // Accepting the radius from user input
        System.out.println("Enter the value for the radius");
        radius = sc.nextDouble();
        sc.close();
        // Invoking the Parameterized constructor
        Circle cObj = new Circle(radius, Math.PI);
        System.out.println("Circumference of the Circle: " + String.format("%.3f", cObj.d));
    }
}
