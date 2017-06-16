package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {
	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty(Key, Value);
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.actimind.com/contact.php");
		 String xp="//input[@value='Submit Request']";
		 driver.findElement(By.xpath(xp)).click();
		 Alert alert=driver.switchTo().alert();
		 System.out.println(alert.getText());

		 Thread.sleep(1000);
		 alert.accept();
		 Thread.sleep(1000);
		 driver.quit();
	}

}
