package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage 
{
	private static WebElement element = null;
	//--------comment----------------------------------------------------------------------------------------
	/*
	public static WebElement  swlanguage (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//span[contains(text(),'العربية')]"));
		return element;		
	}*/
	public static WebElement  globalsearch (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		return element;		
	}

	public static WebElement  globalsearchbutton (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//span[@aria-label='search']//*[name()='svg']"));
		return element;		
	}

	public static WebElement  logoutddl (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//span[@aria-label='caret-down']//*[name()='svg']"));
		return element;		
	}
	public static WebElement  syslogout (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//span[normalize-space()='Logout']"));
		return element;		
	}
	

}
