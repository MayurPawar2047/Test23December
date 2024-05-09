package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1Exception {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement customerID = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement seleniumNav = driver.findElement(By.xpath("//a[text()='Selenium']"));
		customerID.sendKeys("12345");
		submitButton.click();

		seleniumNav.click();

		Alert alt = driver.switchTo().alert();
	}
}
