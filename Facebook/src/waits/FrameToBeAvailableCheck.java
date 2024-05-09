package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameToBeAvailableCheck {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		// id="iframeResult"

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000)); // Wait up to 1 seconds
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='iframeResult']")));
		WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryIt.click();

		// run.click();
		// System.out.println(run);
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofMillis(10000)); // Wait up to 5 seconds
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();
	}

}
