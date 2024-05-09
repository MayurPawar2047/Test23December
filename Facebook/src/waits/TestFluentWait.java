package waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestFluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Wait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofMillis(3000)) // Waiting Time
				.pollingEvery(Duration.ofMillis(2000))// Frequency
				.ignoring(NoSuchElementException.class);

		WebElement enterEmailOrPassword = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@id='email']"));
			}
		});
		enterEmailOrPassword.sendKeys("Akshay");
		System.out.println("End");

	}

}
