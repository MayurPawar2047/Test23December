
package dynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTH {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/basic_init/multiple_tables.html");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='DataTables_Table_1']//tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				System.out.print(cell.getText() + ",\t");//td cha text batel 
			}
			System.out.println();
		}
		driver.quit();
	}
}
