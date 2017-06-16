package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.LazyList;

public class MultiElementLocal {

	static String Key="webdriver.chrome.driver";
	static String Value="./driver/chromedriver.exe";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty(Key, Value);
			WebDriver driver =new ChromeDriver();
			driver.get("C:/Users/You Allowed Here/Desktop/selenium/MultiElements.html");
			List< WebElement > allLink=driver.findElements(By.tagName("a"));
			int count=allLink.size();
			System.out.println("Number of lilnks are: " + count);
			for(int i=0; i<count; i++){
				WebElement link=allLink.get(i);
				String text = link.getText();
				System.out.println(text);
				
				}
			driver.close();
	}
}
