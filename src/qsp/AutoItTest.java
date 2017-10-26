package qsp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoItTest {
	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty(Key, Value);
		 ChromeOptions options = new ChromeOptions(); 
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://toolsqa.com/automation-practice-form/");		
		Thread.sleep(1000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		WebElement browse=driver.findElement(By.id("photo"));
		j.executeScript("window.scrollTo(0,"+browse.getLocation().y+")");
		browse.click();
		Runtime.getRuntime().exec("F:/BSSW11/Automation/File.exe");

}}
