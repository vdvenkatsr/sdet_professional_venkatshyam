package Assignment1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Pages.Test3OrangeHRMPageWithXpathAndCSS;

public class XapthAndCSSTest3 {
	WebDriver driver;
	Test3OrangeHRMPageWithXpathAndCSS OrangeOR;
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
		OrangeOR=new Test3OrangeHRMPageWithXpathAndCSS(driver);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();	
	}
	@Test
	public void PrintTitle() {
		// Text Boxes
		Assert.assertTrue(OrangeOR.CheckUserNamWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - User Name with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckUserNamWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - User Name with CSS - Passed", true);
		
		Assert.assertTrue(OrangeOR.CheckPasswordWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - password with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckPasswordWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - password with CSS - Passed", true);
		
		// hyperlinks
		Assert.assertTrue(OrangeOR.CheckForgotPasswordWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - Forgot password Link with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckForgotPasswordWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - Forgot password Link with CSS - Passed", true);
		
		Assert.assertTrue(OrangeOR.CheckFooterLinkWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - Footer Link with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckFooterLinkWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - Footer Link with CSS - Passed", true);
		
		// Images
		Assert.assertTrue(OrangeOR.CheckLogoImageWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - Logo Image with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckLogoImageWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - Logo Image with CSS - Passed", true);
		
		Assert.assertTrue(OrangeOR.CheckFooterImageFBWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - FB Image with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckFooterImageFBWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - FB Image with CSS - Passed", true);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
