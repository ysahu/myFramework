package qsp;

import java.io.File;
import java.io.IOException;




import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;
public class ScreenShotDemo  {

public static void main(String[]args) throws IOException{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	TakesScreenshot t=(TakesScreenshot)driver;
	//EventFiringWebDriver e=new EventFiringWebDriver(driver);
	File src=t.getScreenshotAs(OutputType.FILE);
	File dest=new File("F:\\BSSW11\\Automation\\snap\\bc.jpg");
	FileUtils.copyFile(src, dest);
	driver.quit();
}
}
