package methodsNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributesOne {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		
		String attributeValue=username.getAttribute("placeholder");
		
		System.out.println(attributeValue);//Only give attribute
		
		if(attributeValue.equals("Email address or phone number"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.quit();
	}

}
