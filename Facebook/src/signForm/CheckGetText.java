package signForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGetText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));

		String text = createNewAcc.getText();
		System.out.println(text);

		if (text.equals("Create new account")) {
			System.out.println("PASS");
		} else

		{
			System.out.println("Failed");
		}

	}

}
