package Assignment1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Pages.OrangeHRMPage;

public class XpathAndCSSTest14to15 {

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
		Assert.assertTrue(strURL.contains("dashboard"));
		Reporter.log("Log in Successfull. Dashboard page dislayed", true);
	}
	
	// test_15: Write Xpath Selector of highlighted Rectangular object (in Red)
	@Test(priority=2)
	public void ElementsWithXpath() {
		String strText;
		Boolean ObjectExist;
		ObjectExist= driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).getText();
		Reporter.log("Text Displayed for the Admin Menu Item as :'" + strText +"'", true);
		
		ObjectExist= driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[2]/div")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[2]/div")).getText();
		Reporter.log("Text Displayed for the Leave List ICON as :'" + strText +"'", true);
		
			
		ObjectExist= driver.findElement(By.xpath("//*[@id=\"welcome\"]")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.xpath("//*[@id=\"welcome\"]")).getText();
		Reporter.log("Text Displayed for Welcome message as :'" + strText +"'", true);
		
		ObjectExist= driver.findElement(By.xpath("//*[@id=\"MP_btn\"]")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.xpath("//*[@id=\"MP_btn\"]")).getText();
		Reporter.log("Text Displayed for the market place button as :'" + strText +"'", true);
	}
	
	// test_14 : Write CSS Selector of highlighted Rectangular object (in Red)
	@Test(priority=1)
	public void ElementsWithCSS(){
		String strText;
		Boolean ObjectExist;
		
		ObjectExist= driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b")).getText();
		Reporter.log("Text Displayed for the PIM Menu Item as :'" + strText +"'", true);
		
		ObjectExist= driver.findElement(By.cssSelector("#menu_time_viewTimeModule > b")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.cssSelector("#menu_time_viewTimeModule > b")).getText();
		Reporter.log("Text Displayed for the Time Menu Item as :'" + strText +"'", true);
		
		ObjectExist= driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee > b")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee > b")).getText();
		Reporter.log("Text Displayed for the Miaintenance Menu Item as :'" + strText +"'", true);
		
		ObjectExist= driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div")).getText();
		Reporter.log("Text Displayed for Assign Leave message as :'" + strText +"'", true);
				
		ObjectExist= driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(3) > div")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		strText=driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(3) > div")).getText();
		Reporter.log("Text Displayed for Timesheet message as :'" + strText +"'", true);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}	
	
}
