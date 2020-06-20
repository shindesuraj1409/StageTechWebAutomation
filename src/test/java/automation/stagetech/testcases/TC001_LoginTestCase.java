package automation.stagetech.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.stagetech.pages.LoginScreen;

public class TC001_LoginTestCase extends SetupClass
{
	
	@Test
	public void LoginwithValidCredentials()
	{
		LoginScreen ls= new LoginScreen(driver);
		ls.enter_password("checkvisiblie");
		ls.view_password();
		ls.click_remember_field();
		ls.click_signUp();
		
	}
	
	

}
