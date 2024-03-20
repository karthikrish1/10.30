package pack1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	public void t1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		// create an object for point class
		// pass desired  and y value in it
		// apply it on the window
		
		Point pt= new Point(200,300);
		ob.manage().window().setPosition(pt);
		Thread.sleep(3000);
		ob.quit();
	}

}
