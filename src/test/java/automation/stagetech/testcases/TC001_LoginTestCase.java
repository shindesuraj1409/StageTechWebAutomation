package automation.stagetech.testcases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.stagetech.pages.HomeScreen;
import automation.stagetech.pages.LoginScreen;

public class TC001_LoginTestCase extends SetupClass
{
	
	@Test(dataProvider="setData")
	public void LoginwithValidCredentials(String email, String password) throws InterruptedException, IOException
	{
		LoginScreen ls= new LoginScreen(driver);
		HomeScreen hs= new HomeScreen(driver);
		ls.enter_email(email);
		ls.enter_password(password);
		ls.click_signinButton();
		Thread.sleep(5000);
		String profile_email=hs.profile_email.getText();
		Assert.assertTrue(email.equals(profile_email), "Login Pass");
		
		
	}
	
	@DataProvider
	public Object[][] setData()
	{
		String username="suraj.shinde@globalstep.com";
		String password="Test@007";
		
		return new Object[][]{{username,password}};
		
		
	}
	
	public void writePageSourceToFile(String FileName) throws IOException
	{
		FileWriter fw= new FileWriter(FileName);
		fw.write(driver.getPageSource());
		fw.close();
	}
	

}
