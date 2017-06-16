package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadPopup {

	public static String Key="webdriver.gecko.driver";
	 public static String Value="./driver/geckodriver.exe";

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty(Key, Value);
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[.='Login']")).click();
		driver.findElement(By.id("eLogin")).sendKeys("yashwantsahu00@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("anu9993027408");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[.='Login']")).submit();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='//my.naukri.com/Profile/view/subAction/ar?id=&altresid=#ar']")).click();
		//driver.findElement(By.name("file")).sendKeys("C:\\Users\\You Allowed Here\\Documents\\Yashwant_HCL.docx");

	}

}
