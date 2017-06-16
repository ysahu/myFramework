package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverISTQB {

	public static String Key="webdriver.chrome.driver";
	public static String Value="./driver/chromedriver.exe";
	public static void main(String[] args) {
		System.setProperty(Key, Value);
		WebDriver driver=new ChromeDriver();
		driver.get("http://istqb.in/");
		String xp="//span[.='FOUNDATION']";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		/*
		 * String xp1="//span[.='EXAM DATES']";
		WebElement subMenu =driver.findElement(By.xpath(xp1));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(subMenu));
		subMenu.click(); 
		**/
		WebElement subMenu=driver.findElement(By.xpath("//span[.='ENROLLMENT']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(subMenu));
		action.moveToElement(subMenu).perform();
		WebElement subMenu1=driver.findElement(By.xpath("//span[.='CORPORATE ENROLLMENT']"));
		wait.until(ExpectedConditions.visibilityOf(subMenu1));
		action.moveToElement(subMenu1).perform();
		WebElement subMenu2=driver.findElement(By.xpath("//span[.='ONLINE ENROLLMENT']"));
		wait.until(ExpectedConditions.visibilityOf(subMenu2));
		subMenu2.click();
		
		
		
		

	}

}
