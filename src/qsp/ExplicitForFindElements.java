package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitForFindElements {

	static String Key="webdriver.chrome.driver";
	static String Value="./driver/chromedriver.exe";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty(Key, Value);
			WebDriver driver =new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://online.actitime.com/qsp1/login.do");
			driver.findElement(By.id("username")).sendKeys("yashwantsahu00");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			WebDriverWait wait= new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
			driver.findElement(By.id("logoutLink")).click();
			driver.close();
	}

}
