package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyActi {

	static String Key="webdriver.chrome.driver";
	static String Value="./driver/chromedriver.exe";
	public static void main(String[] args) {
		System.setProperty(Key, Value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://online.actitime.com/qsp1/login.do");
		driver.findElement(By.id("username")).sendKeys("yashwantsahu00");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();	
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}
