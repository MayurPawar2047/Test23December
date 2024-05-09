package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement customerID = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement seleniumNav = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		WebElement insuranceProject = driver.findElement(By.xpath("//a[text()='Insurance Project']"));

		customerID.sendKeys("12345");
		submitButton.click();

		// Thread.sleep(1000);
		// seleniumNav.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
		
		Thread.sleep(1000);
		//WebElement insuranceProject = driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		insuranceProject.click();
		driver.quit();
	}
}
