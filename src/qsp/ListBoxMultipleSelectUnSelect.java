package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBoxMultipleSelectUnSelect {

	public static String Key="webdriver.chrome.driver";
	 public static String Value="./driver/chromedriver.exe";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(Key,Value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/You%20Allowed%20Here/Desktop/selenium/ListBox.html");
		WebElement mtr=driver.findElement(By.id("mtr"));
		Select select=new Select(mtr);
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("Dosa");
		if(select.isMultiple()){
			select.deselectByIndex(0);
			select.deselectByValue("v");
			select.deselectByVisibleText("Poori");//deselecting unselected lement will run fine, no error will display
		}else{
			System.out.println("no multiselect");
		}
		

	}

}
