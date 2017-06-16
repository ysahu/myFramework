package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxoptionPrintCount {

	 public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";
	public static void main(String[] args) {
		System.setProperty(Key,Value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/You%20Allowed%20Here/Desktop/selenium/ListBox.html");
		WebElement mtr=driver.findElement(By.id("mtr"));
		Select select=new Select(mtr);
		//find and storin all option in list
		List<WebElement> allOption=select.getOptions();
		//size of list option
		int count=allOption.size();
		System.out.println("Number of options are: " + count);
		//selecting and printing all option one by one
		for(int i=0; i<count; i++){
			select.selectByIndex(i);
			WebElement option =allOption.get(i);
			String text=option.getText();
			System.out.println(text);
			
		}
		
		

	}

}
