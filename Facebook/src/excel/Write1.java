package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write1 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Mayur\\Desktop\\Velocity Notes\\Automation\\MyTestData.xlsx";
        
        try (InputStream file = new FileInputStream(path);
             Workbook book = WorkbookFactory.create(file)) {
            
            Sheet sheet = book.getSheet("TestData");
            if (sheet == null) {
               
               sheet = book.createSheet("TestData");
            }
            
            Row row = sheet.getRow(11);
            if (row == null) {
                // If the row doesn't exist, create it
                row = sheet.createRow(0);
            }
            
            Cell cell = row.createCell(1);
            cell.setCellValue("WriteIntoExcel");
            
            try (OutputStream outFile = new FileOutputStream(path)) {
                book.write(outFile);
            }
            
            System.out.println("Data has been written into the Excel file.");

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        } catch (EncryptedDocumentException e) {
            System.err.println("Encrypted document error: " + e.getMessage());
        }
    }
}
