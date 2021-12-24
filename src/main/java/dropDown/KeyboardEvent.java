package dropDown;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyboardEvent {
	WebDriver driver;
	
	@Test
	public void testDropDown() throws InterruptedException {
		
		//storing webelement
		WebElement userNameElement = driver.findElement(By.xpath("/html/body/div/div/div/form/div[1]/input"));	//driver.findElement()=obj variable to find Element, By.xpath() is a class; we can utilize it 
		WebElement userPasswordElement = driver.findElement(By.xpath("/html/body/div/div/div/form/div[2]/input"));
		WebElement userLoginElement = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		
		
		userNameElement.sendKeys("demo@techfios.com");
		userPasswordElement.sendKeys("abc123");
//		userLoginElement.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		WebElement userDashboardElement = driver.findElement(By.xpath("//h2[contains(text(), 'Dashboard')]"));
		WebElement userCustomerElement = driver.findElement(By.xpath("//span[contains(text(), 'Customers')]"));
		WebElement userAddCustomerElement = driver.findElement(By.xpath("//a[contains(text(), 'Add Customer')]"));
		Assert.assertTrue(true);
		System.out.println(userDashboardElement.getText());
		userCustomerElement.click();
		userAddCustomerElement.click();
		
		WebElement userAddContactElement = driver.findElement(By.xpath("//h5[contains(text(), 'Add Contact')]"));
		Assert.assertTrue(true);
		
		driver.findElement(By.id("account")).sendKeys("sokoeurn chhay");
	
		
		Select sel = new Select(driver.findElement(By.name("cid")));
		sel.selectByVisibleText("SpiderMan LTD");
		
//		Select sel1 = new Select(driver.findElement(By.id("select2-country-container")));
//		sel1.selectByVisibleText("Cambodia");
		
		Thread.sleep(5000);
	}
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();	//remove WebDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
