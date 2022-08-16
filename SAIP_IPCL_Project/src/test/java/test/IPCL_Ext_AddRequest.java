package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.browser.Browser;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.Ext_LandingPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
//------------------------------------------------------start of test-----------------------------------------------------------
public class IPCL_Ext_AddRequest {
	WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	@BeforeTest
	public void Ext_Login() throws InterruptedException {
		// Reports
		spark = new ExtentSparkReporter("IPCL_AddRequest_Report.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		// end of reports
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void IPCL_Externallogin_AddRequest() throws InterruptedException {
		// Reports
		ExtentTest test = extent.createTest("IPCL_Ext_AddRequest_Results");
		test.log(Status.PASS, "IPCL_Ext_AddRequest");
		// end of reports
		driver.get("http://ip-clinic-test.saip.gov.sa");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginPage.Externaluserloginbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginPage.PressoUsername(driver).sendKeys("sap1010122222");
		LoginPage.PressoPassword(driver).sendKeys("Saip@1234");
		LoginPage.Pressologinbutton(driver).click();
		Ext_LandingPage.NewRequestbutton(driver).click();
		Select drpArea = new Select(Ext_LandingPage.Area(driver));
		drpArea.selectByVisibleText("عسير");
		Ext_LandingPage.ApplicantType(driver).click();
		Select drRequiredService = new Select(Ext_LandingPage.Domain(driver));
		drRequiredService.selectByVisibleText("حقوق المولف");
		Select drDomain = new Select(Ext_LandingPage.RequiredService(driver));
		drDomain.selectByVisibleText("اختبار");
		Ext_LandingPage.Inquiry(driver).sendKeys("اختبار");
		Ext_LandingPage.Sendrequest(driver).click();
		Ext_LandingPage.RequestcreationconfirmationButton(driver).click();
		
	}
	// -------------------------------------------------End ofTest------------------------------------------------
	@AfterTest()
	public void teardown() {
		//driver.close();
		//extent.flush();
		//Browser.close();
	}
}
