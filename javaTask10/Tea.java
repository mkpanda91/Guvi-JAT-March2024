//Program 5 & 7 
//This file includes Parent class: "Tea" & the main method (in different class).
package javaTask10;

//Solution to Program 5
public class Tea {
    public void prepareTea() {
        System.out.println("Preparation of Basic Tea with hot water and tea leaves");
        System.out.println();
    }

    public void addMilk() {
        System.out.println("Adding Milk to Basic Tea");
    }

    public void addSugar() {
        System.out.println("Adding Sugar to Basic Tea");
    }
}

// Solution to Program 7
class TeaImplementation {
    public static void main(String[] args) {
        Tea[] allTeas = new Tea[4];
        allTeas[0] = new Tea(); // Creates a Tea object
        allTeas[1] = new BlackTea(); // Creates a BlackTea object
        allTeas[2] = new GreenTea(); // Creates a GreenTea object
        allTeas[3] = new HerbalTea(); // Creates a HerbalTea object

        allTeas[0].prepareTea();
        allTeas[1].prepareTea();
        allTeas[2].prepareTea();
        allTeas[3].prepareTea();
    }

}