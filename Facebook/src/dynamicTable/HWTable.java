
package dynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// How to handle the HTML table:
		// - Using relative XPath to find all rows in the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
// Printing the complete table
		for (WebElement row : rows) {
// Finding all cells in the current row
			List<WebElement> cells = row.findElements(By.tagName("td"));
// Printing text of each cell
			for (WebElement cell : cells) {
				System.out.print(cell.getText() + "\t"); // Print cell text followed by a tab
			}
			System.out.println(); // Move to the next line after printing each row
		}

		// Closing the WebDriver session
		driver.quit();

	}

}
