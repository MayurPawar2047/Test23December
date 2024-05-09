package iFrame;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealiFrameTest1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/js_popup.asp");

        // Click on the "Try it Yourself" link for the alert
        WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
        alert.click();

        // Switch to the new window (child browser)
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        // Switch to the iframe
        driver.switchTo().frame("iframeResult");

        // Click on the "Try it" button inside the iframe
        WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryItButton.click();

        // After interacting with the iframe, you may need to switch back to the default content
       driver.switchTo().defaultContent();

        System.out.println("END");
    }

}
