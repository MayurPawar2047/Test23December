package methodsNames;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		Dimension d=new Dimension(100,400);//w,h pixel
		driver.manage().window().setSize(d);
		
		System.out.println("Height:" +d.getHeight()+" Width:"+d.getWidth());
		Thread.sleep(1000);
		
		Point p=new Point(200,400);//X,Y pixel
		driver.manage().window().setPosition(p);
		
		System.out.println("X axis:"+p.x +" Y axis:"+p.y);
		
		

	}

}
