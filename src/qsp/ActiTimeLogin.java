package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	
	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty(Key, Value);
		WebDriver driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(1000);
		String eTitle="actiTIME - Enter Time-Track";
		String aTitle= driver.getTitle();
		System.out.println(aTitle);
		if(aTitle.equals(eTitle)){
			System.out.println("Passed");
		}
		else{
			System.out.println("false");
		}
		driver.findElement(By.className("label")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
