package dropDown;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	WebDriver driver;
	
	@Test
	public void testDropDown() throws InterruptedException {
		
		
		//products>Monitor>ForHome is just to select.
		WebElement userProducts = driver.findElement(By.xpath("//span[contains(text(), 'Products')]"));
		WebElement userMonitors = driver.findElement(By.xpath("//a[contains(text(), 'Monitors')]"));
		WebElement userForHome = driver.findElement(By.linkText("For Home"));
		
		Actions action = new Actions(driver);
		action.moveToElement(userProducts).build().perform();
//		action.moveToElement(userMonitors).build().perform();
		userForHome.click();
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'For Home')]"))).build().perform();
//		driver.findElement(By.linkText("For Home")).click();
		
		
//		Thread.sleep(3000);

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
//		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}

}
