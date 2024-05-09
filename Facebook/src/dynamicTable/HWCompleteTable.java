
package dynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWCompleteTable {

    public static void main(String[] args) {
        
        // Setting up WebDriver for Chrome
        WebDriver driver = new ChromeDriver();
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Navigating to the web page with the table
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        // How to handle the HTML table:
        // - Using relative XPath for matching all rows within the first column
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));
        
        // Printing the column header
        System.out.println("Column 1:");
        
        // Iterating through each row and printing the text of the first column
        for(WebElement row : rows) {
            System.out.println(row.getText());
        }
        
        // Closing the WebDriver session
        driver.quit();
        
    }

}
