package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPastDemo {

	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty(Key, Value);
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Yashwant");
		driver.findElement(By.name("firstname")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.name("firstname")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.name("lastname")).sendKeys(Keys.CONTROL,"v");
	}

}
