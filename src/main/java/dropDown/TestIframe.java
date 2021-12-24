package dropDown;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class TestIframe {
	WebDriver driver;
	
	@Test
	public void testIframe () throws InterruptedException {
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("java.awt")).click();
		Thread.sleep(2000);
		

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Composite")).click();
		
////		driver.switchTo().defaultContent();
//		WebElement userDashboardElement = driver.findElement(By.linkText("Overview"));
//		Assert.assertTrue("Overview", false);
////		Assert.assertEquals(null, null, null);
////		Assert.assertEquals("Overview", userDashboardElement.getText());

		
		
		
		
	}
	
	
	
	
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();	//remove WebDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
