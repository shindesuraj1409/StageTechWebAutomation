package automation.stagetech.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.utils.FileUtil;

import automation.stagetech.utilities.Browsers;
import automation.stagetech.utilities.ReadConfig;



public class SetupClass 
{
	ReadConfig readConfig= new ReadConfig();
	public static WebDriver driver;
	public static Logger logger;
	public String webPageUrl=readConfig.getApplicationURl();
	public String chromeDriverLocation=readConfig.getCromedriverlocation();
	public String firefoxdriverLocation=readConfig.getfirfoxdriverlocation();
	public String ieDriverLocation=readConfig.getiedriverlocation(); 
	public String edgedriverlocation=readConfig.getEdgeDriverLocation();

	public int ImplicitWaitTime=30;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=Browsers.chromedriverInit(driver,chromeDriverLocation);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver=Browsers.fireFoxdriverInit(driver,firefoxdriverLocation);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=Browsers.edgedriverinit(driver, edgedriverlocation);
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver=Browsers.iedriverinit(driver, ieDriverLocation);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ImplicitWaitTime, TimeUnit.SECONDS);
		driver.get(webPageUrl);
		logger=Logger.getLogger("StageTech Logs");
		PropertyConfigurator.configure("log4j.properties");
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

public void captureScreenshot(WebDriver driver, String tname) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	File target= new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot Taken");
	
}

}
