package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsunPriceFlip {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("samsung j7");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		String xp="//div[.='SAMSUNG Galaxy J7 (Black, 16 GB)']/../../div[2]//div[1]";
		String price = driver.findElement(By.xpath(xp)).getText();
		System.out.println(price);
	}

}
