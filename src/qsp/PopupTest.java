package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupTest {
	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty(Key, Value);
		 ChromeOptions options = new ChromeOptions();
		 
		// add parameter which will disable the extension
		options.addArguments("--disable-extensions");
		 
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://localhost/login.do");		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		WebElement elementToClick=driver.findElement(By.xpath("//nobr/span[@class='dashedLink' and contains(text(),'New')]"));
		j.executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
		elementToClick.click();
		//driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys("Aryan");
		WebElement elementClick=driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']"));
		j.executeScript("window.scrollTo(0,"+elementClick.getLocation().y+")");
		elementClick.sendKeys("Bhai");
		//driver.findElement(By.xpath("//div/span[@class='buttonTitle' and contains(text(),'Create Tasks')]")).click();
		WebElement button=driver.findElement(By.xpath("//div/span[@class='buttonTitle' and contains(text(),'Create Tasks')]"));
		j.executeScript("window.scrollTo(0,"+button.getLocation().y+")");
		button.click();
		Thread.sleep(1000);
		
		driver.quit();
		
}
}
