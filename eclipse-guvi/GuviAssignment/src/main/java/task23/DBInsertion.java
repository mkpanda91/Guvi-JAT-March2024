package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsertion {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// Establish connection with the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Details", "root",
				"Mkp@6370");

		// Create a statement to run a query in DB
		Statement stmt = conn.createStatement();

		// Store the required query as a String
		String query = "INSERT INTO Emp VALUES (101, 'Jenny', 25, 10000),"
				+ "(102, 'Jacky', 30, 20000),(103, 'Joe', 20, 40000),"
				+ "(104, 'John', 40, 80000),(105, 'Shameer', 25, 90000)";
		// Execute the query with the help of SQL statement object
		int size = stmt.executeUpdate(query);

		// Verify if any records are inserted in DB
		if (size == 5)
			System.out.println("\nRecords are inserted in the table successfully...");
		else
			System.out.println("\nInsertion has failed into the SQL table");
		conn.close();
	}

}
