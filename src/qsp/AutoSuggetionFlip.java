package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionFlip {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile");
		Thread.sleep(5000);
		String xp="//ul/li//a[contains(text(),'mobile')]";
		List<WebElement> allMobiles = driver.findElements(By.xpath(xp));
		for(WebElement mobile:allMobiles){
		System.out.println(mobile.getText());
		}
		driver.quit();
	}

}
