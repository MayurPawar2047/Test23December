package iFrame;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTwoParentOneChild {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		
		WebElement tiy1=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		tiy1.click();
		
		List<String> list=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(list.get(0));//Main
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(list.get(1));//Child
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement getYourOwnWebsite = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		getYourOwnWebsite.click();
		
		List<String> list1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getCurrentUrl());
		
		WebElement getStartedForFree = driver.findElement(By.xpath("//a[text()='Get Started for Free']"));
		getStartedForFree.click();
		
		

	}

}
