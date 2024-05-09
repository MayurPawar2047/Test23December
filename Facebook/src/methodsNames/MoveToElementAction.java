package methodsNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);

		WebElement accAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement yourOrder = driver.findElement(By.xpath("//span[text()='Your Orders']"));

		//Actions act = new Actions(driver);
		Actions act=new Actions(driver);
		

		act.moveToElement(accAndList).moveToElement(yourOrder).click().build().perform();
		
		
//act.click();
//act.doubleClick();

//act.contextClick();
//act.moveToElement(createNewAcc)

	}

}
