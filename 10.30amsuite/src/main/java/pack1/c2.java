package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class c2 {

	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		//create an object for select class
		//pass dropdown box as input
		//index/value/visible text
		// at a time only one option can be selected
		
		WebElement ele = ob.findElementById("carselect");
		Select s= new Select(ele);
		//s.selectByIndex(2);
		//s.selectByValue("honda");
		s.selectByVisibleText("Honda");
		Thread.sleep(3000);
		//take screenshot and store it in a file
		//copy , paste> file utils=> apache directory studio common io
		
		File f = ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\10.30amsuite\\src\\main\\java\\pack1\\a.png"));
		ob.quit();
	}
}
