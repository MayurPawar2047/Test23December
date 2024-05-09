package iFrame;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealiFrameTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alert=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alert.click();
		
		//Child browser
		List<String> list =new ArrayList<String>(driver.getWindowHandles() );
		driver.switchTo().window(list.get(1));
		
		//How to handle the iframe
		//driver.switchTo().frame(1); // 1 or 2
		driver.switchTo().frame("iframeResult");//Id or Name attribute value
		
		WebElement frameLocator=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frameLocator);
		
		Thread.sleep(1000);
		WebElement  tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		
		System.out.println("END");
	}

}
