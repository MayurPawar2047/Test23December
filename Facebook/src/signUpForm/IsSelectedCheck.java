package signUpForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelectedCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(1000); //Delay
		
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createAccount.click();
		//Thread.sleep(1000);

		WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		//Always select type attribute radio and give its indexes
		boolean result = custom.isSelected();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Check box is Selected");
		}
		else
		{
			custom.click();
			System.out.println("Check box is not Selected");
		}
		result = custom.isSelected();
		
		//String qq=result.getText();
		
		
		System.out.println(result);

	}

}
