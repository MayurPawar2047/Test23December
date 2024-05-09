package iFrame;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetParentChildMakeParent1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/js_popup.asp");

        // Click on the "Try it Yourself" link for the alert
        WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
        alert.click();

        // Switch to the child browser window
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        String parentWindowHandle = windowHandles.get(0);
        String childWindowHandle = windowHandles.get(1);
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Parent Window URL: " + driver.getCurrentUrl());
        System.out.println("Parent Window Title: " + driver.getTitle());

        driver.switchTo().window(childWindowHandle);
        System.out.println("Child Window URL: " + driver.getCurrentUrl());
        System.out.println("Child Window Title: " + driver.getTitle());

        // Handle iframe
        driver.switchTo().frame("iframeResult");
        WebElement getYourOwnWebsite = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
        getYourOwnWebsite.click();

        // Switch to the new child window
        List<String> newWindowHandles = new ArrayList<>(driver.getWindowHandles());
        String newChildWindowHandle = newWindowHandles.get(2); // Assuming the new child window is the third one
        driver.switchTo().window(newChildWindowHandle);
        System.out.println("New Child Window URL: " + driver.getCurrentUrl());
        System.out.println("New Child Window Title: " + driver.getTitle());

        // Switch back to the parent window
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Back to Parent Window URL: " + driver.getCurrentUrl());
        System.out.println("Back to Parent Window Title: " + driver.getTitle());

        System.out.println("END");
        //driver.quit();
    }

}
