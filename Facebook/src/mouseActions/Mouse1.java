package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Method
		// chaining
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);

		Actions act = new Actions(driver);// Actions is class,driver sangto konta browser var kaam karaiche
		WebElement all = driver.findElement(By.xpath("(//li[@class='dropdown'])[1]"));

		act.moveToElement(all).click().perform();

		Thread.sleep(10000);
		WebElement baby = driver.findElement(By.xpath("//a[text()='Login']"));
		act.moveToElement(baby).click().perform();

	}

}
