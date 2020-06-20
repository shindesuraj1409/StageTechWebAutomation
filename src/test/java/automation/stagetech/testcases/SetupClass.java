package automation.stagetech.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class SetupClass 
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\Eclipse_WorkSpace_two\\automation.stagetech.webapp\\src\\test\\resources\\Driver\\chromedriver83.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://work-reg.test.session.id/works/my-works");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	

}
