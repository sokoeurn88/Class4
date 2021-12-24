package dropDown;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srollup_Scrolldown {
	WebDriver driver;
	
	@Test
	public void testScolldown() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;	//casting concept: (JavascriptExecutor) to force driver to do it
//		jse.executeScript("scoll(0,15500)");
		jse.executeScript("scoll(0,0)");
//		jse.executeScript("window.scrollBy(0,15500)");	//scrollBy(0,800)=axis=0, y=vertical=800;
	
		
		
		Thread.sleep(3000);

	}
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();	//remove WebDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
