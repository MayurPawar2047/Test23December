package windows;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/js/js_popup.asp");
WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));

//mainpage 			//0
alert.click(); // 3
confirm.click(); // 4
prompt.click(); // 2
line.click(); // 1

String mainPage = driver.getWindowHandle();// Only 1 address
System.out.println(mainPage);

//To get the data based in index			Set
List<String> list = new ArrayList<String>(driver.getWindowHandles());
String a0 = list.get(0);// main page
String a1 = list.get(1);// line
String a2 = list.get(2);
String a3 = list.get(3);
String a4 = list.get(4);

System.out.println(a0);
System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
System.out.println(a4);
driver.switchTo().window(a0);
System.out.println(driver.getCurrentUrl());


driver.switchTo().window(a1);
System.out.println(driver.getCurrentUrl());

driver.switchTo().window(a2);
System.out.println(driver.getCurrentUrl());

driver.switchTo().window(a3);
System.out.println(driver.getCurrentUrl());

driver.switchTo().window(a4);
System.out.println(driver.getCurrentUrl());
driver.quit();
}
}
