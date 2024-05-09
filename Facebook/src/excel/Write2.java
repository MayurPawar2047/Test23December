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

public class Write2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\Mayur\\Desktop\\Velocity Notes\\Automation\\MyTestData.xlsx";

		InputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("TestData");
		sheet = book.createSheet("YashSuperStar");
		Row row = sheet.getRow(9);
		row = sheet.createRow(0);
		Cell cell = row.createCell(1);
		cell.setCellValue("Yash");

		OutputStream outFile = new FileOutputStream(path);
		book.write(outFile);
		System.out.println("Pass");
		}
	
}


