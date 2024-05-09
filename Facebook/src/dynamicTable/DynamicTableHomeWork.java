
package dynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableHomeWork {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://datatables.net/examples/basic_init/multiple_tables.html");

        WebElement table = driver.findElement(By.id("DataTables_Table_1"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (int j = 0; j < cells.size(); j++) {
            	 WebElement cell = cells.get(j);
                System.out.print(cell.getText() + ",\t");//td cha text batel 
            }
            System.out.println();
        }
      driver.quit();
    }
}
