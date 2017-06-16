package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";
	public static void main(String[] args) {
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.actimind.com/");
		String xp="//span[.='About Company']";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		String xp2="//a[.='Basic Facts']";
		driver.findElement(By.xpath(xp2)).click();
		
		

	}

}
