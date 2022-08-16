package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ext_LandingPage {
	private static WebElement element = null;

	// ------------------------------------------------------------------------------------------------
	public static WebElement NewRequestbutton(WebDriver driver)

	{
		element = driver
				.findElement(By.xpath("//*[@id=\"mxui_widget_DataView_1\"]/div/div[1]/div/div/div[3]/button[2]"));
		return element;
	}

	// ------------------------------------------------------------------------------------------------
	public static WebElement ApplicantType(WebDriver driver)

	{
		element = driver.findElement(By.xpath("//input[@value='Person']"));
		return element;
	}

	// ------------------------------------------------------------------------------------------------
	public static WebElement Area(WebDriver driver)

	{
		element = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/select[1]"));
		return element;
	}

	// ------------------------------------------------------------------------------------------------
	public static WebElement Domain(WebDriver driver)

	{
		element = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/select[1]"));
		return element;
	}

	// ------------------------------------------------------------------------------------------------
	public static WebElement RequiredService(WebDriver driver)

	{
		element = driver.findElement(By.xpath(
				"//body//div[@data-focus-capturing='non-modal']//div[@data-mx-placeholder='main']//div//div//div//div//div//div//div//div//div//div//div[2]//div[1]//div[1]//select[1]"));
		return element;
	}

	// ------------------------------------------------------------------------------------------------
	public static WebElement Inquiry(WebDriver driver)

	{
		element = driver.findElement(By.xpath("//textarea[@aria-required='true']"));
		return element;
	}

	// ------------------------------------------------------------------------------------------------
	public static WebElement Sendrequest(WebDriver driver)

	{
		element = driver.findElement(By.xpath("//button[2]"));
		return element;
	}
	// ------------------------------------------------------------------------------------------------
			public static WebElement RequestcreationconfirmationButton(WebDriver driver)
			{
				element = driver.findElement(By.xpath("//button[contains(text(),'نعم')]"));
				return element;
			}

	
			
	
	
	
	
	
	
	// ------------------------------------------------------------------------------------------------
		public static WebElement RequestDetailsButton(WebDriver driver)
		{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[6]/button[1]/img[1]"));
			return element;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
