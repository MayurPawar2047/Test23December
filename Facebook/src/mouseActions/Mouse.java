import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        // Open the website
        driver.get("https://demo.guru99.com/test/newtours/");

        // Find the elements
       

        // Initialize Actions
        Actions act = new Actions(driver);

        // Move to the first element, pause, then move to the second element and click
        act.moveToElement(all).pause(Duration.ofSeconds(1)).moveToElement(baby).click().build().perform();

        // Close the browser
        //driver.quit();
    }
}
