package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxOptionSortingChecking {

	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";
	 public static ArrayList<String> getListBoxContent(WebElement listBox){
		 Select select=new Select(listBox);
			List<WebElement> alloption = select.getOptions();
			ArrayList<String> allText=new ArrayList<String>();
			for(int i=0; i<alloption.size();i++){
				String text = alloption.get(i).getText();
				allText.add(text);
			}
			return allText;
		 
	 }
	 
	public static void main(String[] args) {
		System.setProperty(Key,Value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/You%20Allowed%20Here/Desktop/selenium/ListBox.html");
		WebElement listBox=driver.findElement(By.id("mtr"));
		ArrayList<String> allText=getListBoxContent(listBox);
		ArrayList<String> clone=new ArrayList<String>(allText);
		Collections.sort(clone);
		//Checking sorted or not
		if(allText.equals(clone)){
			System.out.println("Sorted");
		}else{
			System.out.println("not sorted");
		}
		
		//option present or not
		if(allText.contains("Idly")){
			System.out.println("Present");
		}else{
			System.out.println("not present");
		}
		//checking duplication
		HashSet<String> clone2=new HashSet(allText);
		if(allText.size()==clone2.size()){
			System.out.println("No duplicate");
		}else{
			System.out.println("duplicate there");
		}
		//printing duplicate
		HashSet<String> clone3=new HashSet<String>();
		for(String v:allText){
			if(!(clone3.add(v))){
				System.out.println("Duplicate option is :" +v);
			}
		}
		driver.close();
		
		

	}

}
