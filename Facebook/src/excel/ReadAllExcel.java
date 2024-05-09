package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class ReadAllExcel {

	public static void main(String[] args) {
		String path = "C:\\Users\\Mayur\\Desktop\\Velocity Notes\\Automation\\MyTestData.xlsx";

		try (InputStream file = new FileInputStream(path); Workbook workbook = WorkbookFactory.create(file)) {

			Sheet sheet = workbook.getSheet("TestData");
			if (sheet == null) {
				System.out.println("Sheet not found.");
				return;
			}
			for (Row row : sheet) {
				for (Cell cell : row) {
					String cellValue = "";
					switch (cell.getCellType()) {
					case STRING:
						cellValue = cell.getStringCellValue();
						break;
					case NUMERIC:
						cellValue = String.valueOf(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						cellValue = String.valueOf(cell.getBooleanCellValue());
						break;
					case FORMULA:
						cellValue = cell.getCellFormula();
						break;
					default:
						cellValue = "";
					}
					System.out.print(cellValue + "\t");
				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		} catch (EncryptedDocumentException e) {
			System.err.println("Encrypted document error: " + e.getMessage());
		}
	}
}
