package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptEnterValue {

	public static String Key="webdriver.gecko.driver";
	 public static String Value="./driver/geckodriver.exe";

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty(Key, Value);
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/You%20Allowed%20Here/Desktop/selenium/DisabledDemo.html");
		RemoteWebDriver r=(RemoteWebDriver)driver;
		r.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(1000);
		r.executeScript("document.getElementById('t2').value='manager'");
		Thread.sleep(1000);
		driver.quit();
		

	}

}
