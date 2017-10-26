package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Naukari {
	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty(Key, Value);
		 WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			driver.get("https://www.naukri.com/");

}
}
