package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfRows {
	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";
public static void main(String[] args) {
		System.setProperty(Key,Value);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/You%20Allowed%20Here/Desktop/selenium/Table.html");
		//number of rows in all tables
		List<WebElement> allTR1=driver.findElements(By.tagName("tr"));
		System.out.println("number of rows in all tables " + allTR1.size());
		WebElement row1=driver.findElement(By.tagName("tr"));
		//number of column in first table 
		List<WebElement> column=row1.findElements(By.tagName("td"));
		System.out.println("Number of column in first table " + column.size());
		//Number of rows in first table 
		WebElement element=driver.findElement(By.id("t1"));
		List<WebElement> allTR2=element.findElements(By.tagName("tr"));
		System.out.println("Number of rows in table 1 is: " + allTR2.size());
		//Print data as it is in table format
		for(int i=0;i< allTR2.size();i++){
			WebElement tr =allTR2.get(i);
			List<WebElement> allTD=tr.findElements(By.tagName("td"));
			for(int j=0; j<allTD.size();j++){
				WebElement td=allTD.get(j);
				System.out.print(" " +td.getText());				
			}
			System.out.println();
		}
		driver.close();

	}

}
