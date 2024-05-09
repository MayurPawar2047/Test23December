package screenShoots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int randomNumber = r.nextInt(100);
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
			String formattedDateTime = dateFormat.format(now);
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("C:\\Users\\Mayur\\Desktop\\Velocity Notes\\Automation\\Screenshots\\Test_"
					+ formattedDateTime + "_" + randomNumber + "_" + i + ".png");

			FileHandler.copy(source, dest);
		}
		System.out.println("End");
		driver.quit();
	}
}
