package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlertException2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement alertButton = driver.findElement(By.id("alert1"));
		alertButton.click();

		Alert alert = driver.switchTo().alert();
		alert.accept(); //ok
		//alert.dismiss(); //cancel
		//
		
		
	}
}
