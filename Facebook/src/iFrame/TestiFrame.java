package iFrame;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestiFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alert=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		
		//mainpage		//0
		alert.click();	//1
		
		List<String> list=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));

		WebElement getYourOwnWebsite=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		getYourOwnWebsite.click();
		//Child of child browser
		//1 total address? 2 or 3
		//2 Child of child browser index number ?
		
		List<String> list1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(2));
		
	}
	

}
