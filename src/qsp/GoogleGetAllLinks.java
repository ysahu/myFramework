package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleGetAllLinks {
	@FindBy(id="lst-ib")
	public static WebElement java;
	@FindBy(xpath="//a[contains(text(),'Java')]")
	public static List<WebElement> javaLinks;
	
	public GoogleGetAllLinks(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		GoogleGetAllLinks l=new GoogleGetAllLinks(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	l.java.sendKeys("Java",Keys.ENTER);
	int count=javaLinks.size();
	System.out.println(count);
	for(int i=0; i<javaLinks.size(); i++)
	{
	WebElement javaLink = javaLinks.get(i);
	String text = javaLink.getText();
	System.out.println(text);
	javaLink.click();
	driver.navigate().back();
	}
	driver.close();
	}}