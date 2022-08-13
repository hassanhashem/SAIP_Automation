package test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.OrganizationsPage;
//start of test case
public class OrganizationsTCases 
{
	WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	@SuppressWarnings("deprecation")	
	@BeforeTest
	public void Createneworg() throws InterruptedException 
	{
		//Reports
		spark = new ExtentSparkReporter("WoqodyExecutionReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		//end of reports
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\SelenuimWoqodyWeb\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging-admin.woqody.tech/login");
		LoginPage.loginusername(driver).sendKeys("admin@woqody-staging.tech");
		LoginPage.loginpassword(driver).sendKeys("@P@2CK550OQylm");
		LoginPage.loginbutton(driver).click();
	}	
	@SuppressWarnings("deprecation")			
	@Test
	public void CreatenormalOrg() throws InterruptedException
	{
		//Reports
		ExtentTest test = extent.createTest("Create new org");
		test.log(Status.PASS, "Create new org");
		//end of reports
		//Start Test here...
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		OrganizationsPage.Organizationslink(driver).click();
		OrganizationsPage.NewOrganizationslink(driver).click();
		OrganizationsPage.Organizationname(driver).sendKeys("Auto1");
		OrganizationsPage.Organizationcountry(driver).click();
		OrganizationsPage.Organizationcountrylist(driver).click();
		OrganizationsPage.Organizationaddress(driver).sendKeys("Cairo,nozha");
		OrganizationsPage.Organizationsave(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		OrganizationsPage.Organizationsaveconfirmationmessage(driver).getText();
		String actual  = OrganizationsPage.Organizationsaveconfirmationmessage(driver).getText();
		System.out.println(actual);
		String expected = "New organization successfully";
		Assert.assertEquals(actual, expected);
	}
	//End of Test
	@AfterTest()
	public void teardown() 
	{
		driver.close();
		extent.flush();
		Browser.close();
	}
}
