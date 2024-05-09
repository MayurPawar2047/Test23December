package dynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> AllLinks=driver.findElements(By.xpath("//a"));
		
		int noOfWebelements=AllLinks.size(); // number of data stored in collection
		System.out.println(noOfWebelements);
		
		for(int i=0;i<noOfWebelements;i++)
		{
			WebElement ele=AllLinks.get(i);
			String link=ele.getAttribute("href");
			System.out.println(link);
		}
		
		driver.quit();
		

	}

}
