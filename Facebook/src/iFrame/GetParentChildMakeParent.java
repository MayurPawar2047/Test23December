package iFrame;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetParentChildMakeParent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alert=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alert.click();
		
		//Child browser
		List<String> list =new ArrayList<String>(driver.getWindowHandles() );
		driver.switchTo().window(list.get(0));
		String a0 = list.get(0);
		String a1 = list.get(1);
		System.out.println(a0);
		driver.switchTo().window(a0);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println(a1);
		driver.switchTo().window(a1);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		
		//How to handle the iframe
		//driver.switchTo().frame(1); // 1 or 2
		
		WebElement getYourOwnWebsite=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		getYourOwnWebsite.click();
		
		List<String> list1 =new ArrayList<String>(driver.getWindowHandles() );
		driver.switchTo().window(list1.get(1));
		String b0 = list.get(2);
		String b1 = list.get(3);
		
		System.out.println(b0);
		driver.switchTo().window(b0);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println(b1);
		driver.switchTo().window(b1);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		

		List<String> list2 = new ArrayList<>(driver.getWindowHandles());
		String c0 = list2.get(2); // Corrected index to get the third window handle
		driver.switchTo().window(c0);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());


		
		System.out.println("END");
		
	}

}
