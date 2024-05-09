package dynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//How to handle the HTML table
		//-Using relative xpath for matching all cells
		//-using findElements method
		List<WebElement> Cells=driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		int noOfCells=Cells.size();
		System.out.println(noOfCells);
		
		for(int i=0;i<noOfCells;i++)
		{
			WebElement cell=Cells.get(i);
			String text=cell.getText();
			System.out.println(text);
		}
		driver.quit();
		
	}

}
