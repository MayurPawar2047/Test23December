package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReader {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// 1.Path
		// String path = "C:\\Users\\Mayur\\Desktop\\Velocity
		// Notes\\Automation\\MyTestData.xlsx";
		// InputStream file = new FileInputStream(path);
//
//		// 2.Open
//		Workbook book = WorkbookFactory.create(file);
//
//		// 3.Select Sheet
//		Sheet sheet = book.getSheet("TestData");
//
//		// 4.Select Row
//		Row row = sheet.getRow(0);
//
//		// 5.Select cell
//		Cell cell = row.getCell(3);
//
//		// 6.Copy data / Get data
//
//		String data = cell.getStringCellValue();
//		java.util.Date data1 = cell.getDateCellValue();
//		System.out.println(data1);

		// 1.Path
		String path = "C:\\Users\\Mayur\\Desktop\\Velocity Notes\\Automation\\MyTestData.xlsx";
		InputStream file = new FileInputStream(path);
		String excelData = WorkbookFactory.create(file).getSheet("TestData").getRow(0).getCell(1).getStringCellValue();
		System.out.println(excelData);

		//Double exceldata=WorkbookFactory.create(file).getSheet("TestData").getRow(1).getCell(1).getNumericCellValue();
//System.out.println(exceldata);

//Double Timeexceldata=WorkbookFactory.create(file).getSheet("TestData").getRow(1).getCell(3).getNumericCellValue();
//System.out.println(Timeexceldata);
		
		//java.util.Date Mydate=WorkbookFactory.create(file).getSheet("TestData").getRow(1).getCell(3).getDateCellValue();
		//System.out.println(Mydate);


	}

}
