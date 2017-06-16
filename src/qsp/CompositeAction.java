package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CompositeAction {

	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty(Key, Value);
		WebDriver driver =new ChromeDriver();
		driver.get("https://online.actitime.com/qsp1/login.do");
		WebElement link=driver.findElement(By.linkText("actiTIME Inc."));
		Actions action=new Actions(driver);
		action.sendKeys(Keys.CONTROL).click(link).perform();

	}

}
