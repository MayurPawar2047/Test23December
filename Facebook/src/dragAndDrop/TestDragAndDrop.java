package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(1000);

		WebElement src = driver.findElement(By.xpath("(//h5[@class='ui-widget-header'])[1]"));
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).click().build().perform();
		System.out.println("End");

	}

}
