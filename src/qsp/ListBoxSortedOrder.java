package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSortedOrder {
	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";

	public static ArrayList<String> getListBoxContent(WebElement listBox){
		Select select=new Select(listBox);
		List<WebElement> allOption=select.getOptions();
		ArrayList<String> allText=new ArrayList<String>();
		for(int i=0; i<allOption.size();i++){
			String text=allOption.get(i).getText();
			allText.add(text);
		}
		
		
		return allText ;
	}
	
	public static void main(String[] args) {
		System.setProperty(Key,Value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/You%20Allowed%20Here/Desktop/selenium/ListBox.html");
		WebElement listBox=driver.findElement(By.id("mtr"));
		ArrayList<String> allText= getListBoxContent(listBox);
		//sorted all options
		Collections.sort(allText);
		for(String v:allText){
			System.out.println(v);
		}
		
		
		
	}

}
