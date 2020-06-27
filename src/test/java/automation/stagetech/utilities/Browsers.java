package automation.stagetech.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers
{
	
	public static WebDriver chromedriverInit(WebDriver driver,String driverLocation)
	{
		System.setProperty("webdriver.chrome.driver", driverLocation);
		driver=new ChromeDriver();
		
		return driver;
	}
	
	public static WebDriver fireFoxdriverInit(WebDriver driver,String firfoxdriverlocation)
	{
		System.setProperty("webdriver.gecko.driver", firfoxdriverlocation);
		driver=new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver iedriverinit(WebDriver driver,String ieDriverLocation)
	{
		System.setProperty("webdriver.ie.driver", ieDriverLocation);
		driver=new InternetExplorerDriver();
		return driver;
	}
	
	public void safariInitialization()
	{
		
	}
	
	public static WebDriver edgedriverinit(WebDriver driver,String edgedriverlocation)
	{
		System.setProperty("webdriver.edge.driver", edgedriverlocation);
		driver=new EdgeDriver();
		return driver;
	}

}
