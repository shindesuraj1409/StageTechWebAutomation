package automation.stagetech.pageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM {
	WebDriver driver;
	public static Logger logger;
	public POM(WebDriver driver)
	{
		this.driver=driver;
		logger=Logger.getLogger("StageTech");
		PropertyConfigurator.configure("log4j.properties");
		PageFactory.initElements(driver, this);
	}

}
