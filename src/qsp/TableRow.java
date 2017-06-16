package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(ActiTimeLogin.Key, ActiTimeLogin.Value);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/You%20Allowed%20Here/Desktop/selenium/Table.html");
		WebElement td1=driver.findElement(By.tagName("td"));
		String text=td1.getText();
		System.out.println(text);
		WebElement element=driver.findElement(By.id("t2"));
		WebElement td2=element.findElement(By.tagName("td"));
		String text2=td2.getText();
		System.out.println(text2);
		

	}

}
