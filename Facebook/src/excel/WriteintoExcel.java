package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteintoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\Mayur\\Desktop\\Velocity Notes\\Automation\\MyTestData.xlsx";
		InputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("TestData");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(1);

		cell.setCellValue("Yash");
		System.out.println("Main");
		

	}

}
