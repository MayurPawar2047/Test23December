package methodsNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextOne {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));

		String text = createNewAcc.getText();
		System.out.println(text);

		if (text.equals("Create new account")) {
			System.out.println("PASS");
		} else

		{
			System.out.println("Failed");
		}
		
		//div[@id='reg_pages_msg']
		
		WebElement createFanPage=driver.findElement(By.xpath("//div[@id='reg_pages_msg']"));
		String fan=createFanPage.getText();
		System.out.println(fan);
		
		if(fan.equals("Create a Page for a celebrity, brand or business.")) {
			System.out.println("Balle balle");
		}
		else {
			System.out.println("Again do");
		}
		
		driver.quit();
		

	}

}
