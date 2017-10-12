package qsp;

import org.eclipse.jetty.util.ByteArrayISO8859Writer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ActiTimeInvalidLogin {
	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";
		

	@Test
	public void testingInvalidLogin() throws InterruptedException{
		 System.setProperty(Key, Value);
			WebDriver driver =new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://localhost/login.do");
			driver.findElement(By.id("username")).sendKeys("adin");
			driver.findElement(By.name("pwd")).sendKeys("manger");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			WebElement errMsg=driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
			WebDriverWait wait = new WebDriverWait(driver,10);
			try{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			Reporter.log("Pass: Err MSG displayed",true);
			}catch(Exception e){
				Reporter.log("Fail: Err MSG not displayed",true);
				Assert.fail();
		
		}
		
	

}}
