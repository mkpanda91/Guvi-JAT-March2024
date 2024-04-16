//Program 3: Treemap of Emp Id and Name. Print Employee names in alphabetical order
package javaTask12;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeIdAndName {

  private static TreeMap<Integer, String> sortByValues(TreeMap<Integer, String> emp) {
    Comparator<Integer> valueComparator = new Comparator<Integer>() {
      public int compare(Integer k1, Integer k2) {
        int compare = emp.get(k1).compareTo(emp.get(k2));
        if (compare == 0)
          return 1;
        else
          return compare;
      }
    };
    TreeMap<Integer, String> sortedTM = new TreeMap<Integer, String>(valueComparator);
    sortedTM.putAll(emp);
    return sortedTM;
  }

  public static void main(String[] args) {
    // Creates an empty TreeMap object
    TreeMap<Integer, String> emp = new TreeMap<>();
    // Create a Scanner object
    Scanner sc = new Scanner(System.in);
    // Initialize the TreeMap object
    for (int i = 0; i < 4; i++) {
      System.out.println("Enter the employee id and name for Employee " + (i + 1));
      emp.put(sc.nextInt(), sc.next());
    }
    sc.close();
    // Print the initial TreeMap object content
    System.out.println("\nBefore Sorting by values (Names) in alphabetical order");
    System.out.println("\nEmployee ID : Employee Name");
    for (Entry<Integer, String> m : emp.entrySet())
      System.out.println(m.getKey() +
          " : " + m.getValue());

    TreeMap<Integer, String> sortedEmp = sortByValues(emp);
    // Print the sorted TreeMap by value
    System.out.println("\nAfter Sorting by values (Names) in alphabetical order");
    System.out.println("\nEmployee ID : Employee Name");
    for (Entry<Integer, String> entry : sortedEmp.entrySet())
      System.out.println(entry.getKey() + " : " + entry.getValue());

  }
}
