// This program contains solution from 1 - 4 of Task 13
package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingToExcel {
	public static void main(String[] args) {

		// WritingToExcel excel = new WritingToExcel();
		writeToExcel();
	}

	public static void writeToExcel() {
		// Set the Stream to connect to excel file
		try {
			FileInputStream fis = new FileInputStream(
					"C:/Users/Mahesh/Downloads/Guvi/Guvi_Java-Assignments/javaTask13/excelreadwrite/Task13-Book1.xlsx");
			// Open the Workbook
			XSSFWorkbook xlWorkbook = new XSSFWorkbook(fis);
			// Open the Sheet
			XSSFSheet xlSheet = xlWorkbook.getSheetAt(0);
			// Create Row Number 1. Then create one column (cell) at a time and add values
			XSSFRow xlRow = xlSheet.createRow(0);
			XSSFCell xlCell = xlRow.createCell(0);
			xlCell.setCellValue("Name");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("Age");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("Email");
			// Create Row Number 2. Then create one column (cell) at a time and add values
			xlRow = xlSheet.createRow(1);
			xlCell = xlRow.createCell(0);
			xlCell.setCellValue("John Doe");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("30");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("john@test.com");
			// Create Row Number 3. Then create one column (cell) at a time and add values
			xlRow = xlSheet.createRow(2);
			xlCell = xlRow.createCell(0);
			xlCell.setCellValue("Jane Doe");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("28");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("john@test.com");
			// Create Row Number 4. Then create one column (cell) at a time and add values
			xlRow = xlSheet.createRow(3);
			xlCell = xlRow.createCell(0);
			xlCell.setCellValue("Bob Smith");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("35");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("jacky@example.com");
			// Create Row Number 5. Then create one column (cell) at a time and add values
			xlRow = xlSheet.createRow(4);
			xlCell = xlRow.createCell(0);
			xlCell.setCellValue("Swapnil");
			xlCell = xlRow.createCell(1);
			xlCell.setCellValue("37");
			xlCell = xlRow.createCell(2);
			xlCell.setCellValue("swapnil@example.com");

			// OutStream to write the values to the destination file
			FileOutputStream fos = new FileOutputStream(
					"C:/Users/Mahesh/Downloads/Guvi/Guvi_Java-Assignments/javaTask13/excelreadwrite/Task13-Book1.xlsx");
			xlWorkbook.write(fos);
			fis.close();
			fos.close();
			xlWorkbook.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}