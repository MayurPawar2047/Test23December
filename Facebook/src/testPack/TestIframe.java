package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Iframe id="google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//main_leaderboard_0"
		
		driver.switchTo().frame("google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//main_leaderboard_0");
		
		WebElement iele=driver.findElement(By.xpath("//div[@id='google_image_div']"));
		iele.click();
		
		
		
	
	}

}
