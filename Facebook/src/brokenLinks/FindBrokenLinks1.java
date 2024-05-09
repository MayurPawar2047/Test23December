package brokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        int cnt = 0;
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int b = links.size(); //47 links present
        System.out.println("Number of Anchor tag:" + b);
        for (int i = 0; i < b; i++) {
            WebElement cell = links.get(i);
            String url = cell.getAttribute("href");
            //System.out.println(url);
            
            if (url.isEmpty()) {
                System.out.println("Broken link");
                cnt++;
            }
        }
        System.out.println("Total number of broken links:" + cnt);
        System.out.println("End");
        driver.quit();
    }
}
