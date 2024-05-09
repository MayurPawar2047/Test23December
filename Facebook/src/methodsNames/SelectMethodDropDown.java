package methodsNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

//How to handle the drop down/List box/ Select box		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNewAcc.click();
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//Create the object of select class and pass webelement argument 
		Select s = new Select(month);
	//	s.selectByIndex(0);
	//	s.selectByValue("");
		
	//	s.selectByVisibleText("Episodes 1788 - 1797");

	}

}
