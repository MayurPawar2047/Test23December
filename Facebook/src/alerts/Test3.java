 import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to the webpage
            driver.get("https://omayo.blogspot.com/");

            // Find the element that triggers the alert
            WebElement alertButton = driver.findElement(By.id("alert1"));

            // Click the button to trigger the alert
            alertButton.click();

            // Handle the alert
            Alert alert = driver.switchTo().alert();
            alert.accept(); // or alert.dismiss() depending on your use case

            // Now, you can interact with other elements on the page
            WebElement contentDiv = driver.findElement(By.cssSelector(".prompt-box .container .content"));
            System.out.println("Content: " + contentDiv.getText());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
