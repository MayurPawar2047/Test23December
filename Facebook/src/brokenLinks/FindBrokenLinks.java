package brokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		int cnt = 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));// xpath//a
		int b = links.size();// links =47
		System.out.println("Number of Anchor tag:" + b);
		for (int j = 0; j < b; j++) {
			WebElement cell = links.get(j);
			String url = cell.getText();
			String url1 = cell.getAttribute("href");
			System.out.println(url1);
			if (url1.isEmpty()) {
				System.out.println("Broken link");
				cnt++;
			}
		}
		System.out.println("Total number of broken link:" + cnt);
		System.out.println("End");
		driver.quit();
	}
}
