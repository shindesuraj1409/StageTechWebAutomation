package automation.stagetech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DraftsScreen extends POM
{
	public DraftsScreen(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div/div/div[2]/span/p") public WebElement sortBynameHeading;
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div/div/div[4]/span/p") public WebElement sortByLastUpdated;
	

}
