package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	private static WebElement element = null;
	//------------------------------------------------------------------------------------------------
	public static WebElement  Externaluserloginbutton (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/div[1]/div[2]/div[2]/div/div/div/div/div/div/ul/li[2]/div/div/div/div/div/button"));
		return element;		
	}
	
	
	public static WebElement  PressoUsername (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		return element;		
	}
	
	public static WebElement  PressoPassword (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		return element;		
	}
	
	public static WebElement  Pressologinbutton (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//*[@id=\"kc-login\"]"));
		return element;		
	}
	
	public static WebElement  Internaluserloginbutton (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/div[1]/div[2]/div[2]/div/div/div/div/div/div/ul/li[1]/div/div/div/div/div/button"));
		return element;		
	}
	
	
	
}
