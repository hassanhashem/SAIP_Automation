package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
//------------------------------------------------------start of test-----------------------------------------------------------
public class IPCL_Int_AcceptRequest {
	WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	@BeforeTest
	public void Int_Login() throws InterruptedException {
		// Reports
		spark = new ExtentSparkReporter("IPCL_Int_AcceptRequest.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		// end of reports
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void IPCL_IPCL_Int_AcceptRequest() throws InterruptedException {
		// Reports
		ExtentTest test = extent.createTest("IPCL_Int_AcceptRequest_Results");
		test.log(Status.PASS, "IPCL_Int_AcceptRequest");
		// end of reports
		driver.get("http://ip-clinic-test.saip.gov.sa");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		LoginPage.Internaluserloginbutton(driver).click();	
		LoginPage.PressoUsername(driver).sendKeys("hhashem.c");
		LoginPage.PressoPassword(driver).sendKeys("SaipEmail@2022");
		LoginPage.Pressologinbutton(driver).click();
		
	}
	// -------------------------------------------------End ofTest------------------------------------------------
	@AfterTest()
	public void teardown() {
		driver.close();
		extent.flush();
		Browser.close();
	}
}
