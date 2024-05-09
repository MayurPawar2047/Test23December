package methodsNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectpra {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 WebElement createAccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		 createAccount.click();
		Thread.sleep(1000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select se=new Select(month);
		se.selectByIndex(11);
		//se.selectByValue("11");
		//se.selectByValue("11");//Tag option value ko pass parte
		//se.selectByVisibleText");
		driver.quit();
		 

	}

}
