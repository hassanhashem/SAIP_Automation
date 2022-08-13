package test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.DashboardPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
//start of test case
public class DashboardTCases 
{
	WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	@BeforeTest
	public void Login() throws InterruptedException 
	{
		//Reports
		spark = new ExtentSparkReporter("WoqodyExecutionReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		//end of reports
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","D:\\Automation\\SelenuimWoqodyWeb\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}	
	//Start SWitchlanguage test case
	@SuppressWarnings("deprecation")			
	@Test(priority = 1)
	public void Globalsearch() throws InterruptedException
	{
		//Reports
		ExtentTest test = extent.createTest("Globalsearch Test Results");
		test.log(Status.PASS, "Globalsearch");
		//end of reports
		driver.get("https://staging-admin.woqody.tech/login");
		LoginPage.loginusername(driver).sendKeys("admin@woqody-staging.tech");
		LoginPage.loginpassword(driver).sendKeys("@P@2CK550OQylm");
		LoginPage.loginbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DashboardPage.globalsearch(driver).sendKeys("01060121305");
		DashboardPage.globalsearchbutton(driver).click();
		DashboardPage.globalsearch(driver).sendKeys(Keys.CONTROL + "a");
		DashboardPage.globalsearch(driver).sendKeys(Keys.DELETE);
	}
	//End of Test
	/*
	@Test(priority = 2)
	public void logout() {
		//Reports
		ExtentTest test = extent.createTest("Logout Test Results");
		test.log(Status.PASS, "Logout");
		//end of reports	
		DashboardPage.logoutddl(driver).click();
		DashboardPage.syslogout(driver).click();
	}
	*/
	@AfterTest()
	public void teardown() 
	{
		//driver.close();
		extent.flush();
		//Browser.close();
	}
}
