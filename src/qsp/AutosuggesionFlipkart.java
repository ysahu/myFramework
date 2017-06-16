package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggesionFlipkart {

	static String Key="webdriver.chrome.driver";
	static String Value="./driver/chromedriver.exe";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Key, Value);
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobile");
		String xp="//a[@class='_2XvRSN']";
		List<WebElement> allASG=driver.findElements(By.xpath(xp));
		int count=allASG.size();
		System.out.println("Number of autosuggetions are:" + count);
		for(int i=0; i<count; i++){
			WebElement ASG=allASG.get(i);
			String text=ASG.getText();
			System.out.println(text);
		}
		driver.close();


	}

}
