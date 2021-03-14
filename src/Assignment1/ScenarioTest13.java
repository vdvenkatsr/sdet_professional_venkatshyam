package Assignment1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Pages.OrangeHRMPage;

public class ScenarioTest13 extends TestBase {
	WebDriver driver;
	OrangeHRMPage OrangeOR;
	public static FileInputStream fileLoc;
	public static Properties prop;
		
	@BeforeTest
	public void OpenUrlWithBrowser() {
			try {
				fileLoc = new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.properties");
				prop = new Properties();
				prop.load(fileLoc);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		OrangeOR=new OrangeHRMPage(driver);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();	
	}
	
	@BeforeClass
	public void LogInToApp() throws InterruptedException {
		try {
			fileLoc = new FileInputStream("C:\\Users\\vittlav\\eclipse-workspace\\SeleniumAssignments\\src\\test\\java\\com\\qa\\utilities\\Testdata.properties");
			prop = new Properties();
			prop.load(fileLoc);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		OrangeOR.EnterUserName(username);
		OrangeOR.EnterPassword(password);
		OrangeOR.ClickOnLogInButton();
		Thread.sleep(3000);
		String strURL;
		strURL=OrangeOR.getURL();
		Assert.assertTrue(strURL.contains("dashboard"));
		Reporter.log("Log in Successfull. Dashboard page dislayed", true);
	}

	// test_13:
	@Test
	public void validateEmployeeSearch() throws IOException, InterruptedException {
		String strURL;
		String LName;
		String FName;
		OrangeOR.ClickOnPIMLink();
		strURL=OrangeOR.getURL();
		Assert.assertTrue(strURL.contains("pim"));
		
		OrangeOR.EnterEmployeeName("Venkat Shyam");
		OrangeOR.ClickOnSearch();
		
		FName=OrangeOR.getFirstNameText();
		LName=OrangeOR.getLastNameText();
		boolean fNameresult = FName.contains("Venkat");
		boolean lNameresult = LName.contains("Shyam");
		if(fNameresult & lNameresult)  {
			Thread.sleep(4000);
            captureScreenshot(driver,"Search Success");
            Assert.assertTrue(true); 
            Reporter.log("Search Success, First name and Last name found in search", true);
		}
		else {
            captureScreenshot(driver,"Search Failed");
            Assert.assertTrue(false); 
            Reporter.log("First name and Last name not found in search", true);
		}
		
	}
	
	
	/*@AfterTest
	public void tearDown() {
		driver.quit();
	}*/
}
