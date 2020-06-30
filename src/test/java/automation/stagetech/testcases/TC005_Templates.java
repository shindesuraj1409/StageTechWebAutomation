package automation.stagetech.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.stagetech.pageObjects.HomeScreen;
import automation.stagetech.pageObjects.LoginScreen;
import automation.stagetech.pageObjects.MyWorksTab;
import automation.stagetech.pageObjects.SignUpScreen;
import automation.stagetech.pageObjects.TemplatesScreen;
import automation.stagetech.utilities.Commons;

public class TC005_Templates 
{
	WebDriver driver;
	@BeforeMethod
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver83/chromedriver83.exe");	
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://work-reg.test.session.id/");
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	@Test
	public void checkTemplates() throws InterruptedException
	{
		HomeScreen hs= new HomeScreen(driver);
		TemplatesScreen ts= new TemplatesScreen(driver);
		LoginScreen ls= new LoginScreen(driver);
		SignUpScreen ss= new SignUpScreen(driver);
		Thread.sleep(3000);
		ls.click_signUp();
		ss.signupCreator.click();
		//ss.signupCreator.click();
		
	}


}
