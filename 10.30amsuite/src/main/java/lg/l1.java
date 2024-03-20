package lg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class l1 {


static Logger log= LogManager.getLogger(l1.class);

@Test(groups="One")
public void t1() throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.google.com");
	log.info("visited website");
	System.out.println(ob.getTitle());
	log.info("got title");
	log.info("going to quit");
	ob.quit();
}
}
