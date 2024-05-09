package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckElementClickable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000)); // Wait up to 5 seconds
		WebElement run = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='getwebsitebtn']")));
		run.click();
		System.out.println(run);

	}

}
