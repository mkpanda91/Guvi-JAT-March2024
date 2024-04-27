// This program contains solution for point no 5 of Task 13
package exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {
    public static void main(String[] args) {
        try {
            readExcelFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readExcelFile() throws IOException {
        // Set the path to open the Stream
        FileInputStream fis = new FileInputStream(
                "C:/Users/Mahesh/Downloads/Guvi/Guvi_Java-Assignments/javaTask13/excelreadwrite/Task13-Book1.xlsx");
        // Open the Workbook
        XSSFWorkbook xlWorkbook = new XSSFWorkbook(fis);
        // Open the Sheet
        XSSFSheet xlSheet = xlWorkbook.getSheetAt(0);
        XSSFRow xlRow;
        // Get the number of rows in the excel and iterate the column values to print
        int lastRow = xlSheet.getLastRowNum();

        // Iterate through the Rows
        for (int i = 0; i <= lastRow; i++) {
            xlRow = xlSheet.getRow(i);
            // Get the last column and iterate through the columns
            int lastColumn = xlRow.getLastCellNum();
            if (i == 0) {
                System.out.printf("%-10s %8s %9s\n", xlSheet.getRow(i).getCell(i), xlSheet.getRow(i).getCell(i + 1),
                        xlSheet.getRow(i).getCell(i + 2));
                ++i;
            }
            for (int j = 0; j < lastColumn; j++) {
                DataFormatter formatter = new DataFormatter();
                Object value = formatter.formatCellValue(xlSheet.getRow(i).getCell(j));
                System.out.print(value + " \t");
            }
            System.out.println(" ");
        }
        fis.close();
        xlWorkbook.close();
    }
}
