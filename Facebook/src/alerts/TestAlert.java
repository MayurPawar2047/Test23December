package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/delete_customer.php");
WebElement customerID=driver.findElement(By.xpath("//input[@type='text']"));
WebElement submitButton=driver.findElement(By.xpath("//input[@type='submit']"));

WebElement seleniumNav=driver.findElement(By.xpath("//a[text()='Selenium']"));


customerID.sendKeys("12345");
submitButton.click();

//seleniumNav.click();
//customerID.sendKeys(Keys.ENTER);

//How to handle the Alert Popup

//1.Switch the selenium(driver) focus from Main page to Alert Popup
Alert alt=driver.switchTo().alert();

//2.Using below method we perform the action on alert popup
String text=alt.getText();
System.out.println(text);
alt.dismiss();

//1st Alert popup
//Thread.sleep(3000);
//alt.accept();
//Thread.sleep(3000);
//2nd Alert Popup
//alt.accept();
//driver.quit();
	}

}
