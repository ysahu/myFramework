package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetCracker {

	
	public static void main(String[] args) {
		  String Key="webdriver.chrome.driver";
		   String Value="./driver/chromedriver.exe";
		   System.setProperty(Key, Value);
			WebDriver driver =new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://en.wikipedia.org/wiki/Netcracker_Technology");
			WebElement a=driver.findElement(By.xpath("//td[text()='Information Technology']"));
			String s=a.getText();
			System.out.println(s);

	}

}
