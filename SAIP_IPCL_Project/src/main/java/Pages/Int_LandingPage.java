package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Int_LandingPage {
	private static WebElement element = null;

	// ------------------------------------------------------------------------------------------------
	public static WebElement RequestDetailsbutton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@role='rowgroup']//div[2]//div[7]//button[1]//img[1]"));
		return element;
	}
	// ------------------------------------------------------------------------------------------------
	public static WebElement RequestActionsList(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[contains(text(),'اختيار اجراء')]"));
		return element;
	}
	// ------------------------------------------------------------------------------------------------
	public static WebElement AcceptRequestoption(WebDriver driver) {
		element = driver.findElement(By.xpath("//body//div[@data-focus-capturing='non-modal']//div[@data-mx-placeholder='main']//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//a[1]"));
		return element;
	}
	// ------------------------------------------------------------------------------------------------
	public static WebElement AcceptRequestconfirmation_Yes(WebDriver driver) {
		element = driver.findElement(By.xpath("//body//div[@role='dialog']//div//div//div//button[1]"));
		return element;
	}
	// ------------------------------------------------------------------------------------------------
	public static WebElement AcceptRequestconfirmationMsgyesButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[contains(text(),'تم قبول الطلب')]"));
		return element;
	}
	// ------------------------------------------------------------------------------------------------
	
	
}
