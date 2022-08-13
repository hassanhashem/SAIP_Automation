package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrganizationsPage 
{
	private static WebElement element = null;
	//-----------------------------------------------------------------------------------	
	public static WebElement  Organizationslink (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/aside[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/a[1]"));
		return element;		
	}
	//-----------------------------------------------------------------------------------------
	public static WebElement  NewOrganizationslink (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//span[contains(text(),'New Organization')]"));
		return element;		
	}
	//-----------------------------------------------------------------------------------------
	public static WebElement  Organizationname (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//input[@id='venues_form_name']"));
		return element;		
	}
	//-----------------------------------------------------------------------------------------
	public static WebElement  Organizationcountry (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//input[@id='venues_form_countryId']"));
		return element;		
	}
	//-----------------------------------------------------------------------------------------
	public static WebElement  Organizationcountrylist (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//div[contains(text(),'Egypt (مصر‎)')]"));
		return element;		
	}
	//-----------------------------------------------------------------------------------------
	public static WebElement  Organizationaddress (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//input[@id='venues_form_address']"));
		return element;		
	}
	//-----------------------------------------------------------------------------------------
	public static WebElement  Organizationsave (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		return element;		
	}
	//-----------------------------------------------------------------------------------------
	public static WebElement  Organizationsaveconfirmationmessage (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//span[normalize-space()='New organization successfully']"));
		return element;		
	}
	//-----------------------------------------------------------------------------------------


	
	
	
	
	
	


	


}
