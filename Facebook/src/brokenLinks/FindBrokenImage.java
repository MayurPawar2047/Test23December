
package brokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenImage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		int cnt = 0;
		List<WebElement> links = driver.findElements(By.tagName("img"));// xpath//a
		int b = links.size();// links =47
		System.out.println("Number of Image tag:" + b);
		for (int j = 0; j < b; j++) {
			WebElement cell = links.get(j);
			String url = cell.getText();
			System.out.println("Valid imagage "+url);
			String img1 = cell.getAttribute("src");
			System.out.println("Attribute method:"+img1);
			if (img1.isEmpty()) {
				System.out.println("Broken Images");
				cnt++;
			}
		}
		System.out.println("Total number of Broken Images:" + cnt);
		System.out.println("End");
		driver.quit();
	}
}
