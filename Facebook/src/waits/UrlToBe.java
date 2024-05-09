package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrlToBe {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		Boolean result = wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/"));
		System.out.println(result);
		driver.quit();
	}
}
