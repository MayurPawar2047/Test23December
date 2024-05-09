package waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityOfElementLocatedByXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		// wait for visibility of the element
		WebElement button = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='getwebsitebtn']")));
		System.out.println(button);
		button.click();

	}
}
