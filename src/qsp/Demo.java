package qsp;

import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Key="webdriver.chrome.driver";
		String Value="./driver/chromedriver.exe";
		System.setProperty(Key, Value);
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://google.com");
		String title = driver.getTitle();
		//driver.findElementByTagName("input").click();
		Date d=new Date();
		System.out.println(d);
		driver.close();
		
		

	}

}
