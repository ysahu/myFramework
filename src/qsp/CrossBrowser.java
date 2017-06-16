package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

public static void testBrowser(WebDriver driver) throws InterruptedException{
	driver.get("http://localhost/login.do");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	//Thread.sleep(500000);
	driver.quit();
}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		testBrowser(driver1);
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		CrossBrowser.testBrowser(driver2);
	}

}
