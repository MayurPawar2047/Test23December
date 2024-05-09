package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExampleWebDriverWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		driver.switchTo().frame("iframeResult");
		WebElement alt1 = driver.findElement(By.xpath("//button[text()='Try it']"));
		alt1.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000)); // Wait up to 5 seconds
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();

		System.out.println(alt);

		System.out.println("Alert is present!");

		driver.quit();
	}
}