package automation.stagetech.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileScreen extends POM
{
	public ProfileScreen(WebDriver driver) 
	{
	super(driver);
	}
	
	@FindBy(xpath="//div[@id='root']/div/div[2]/header/div[2]/div/div/div/div/div/a/span/h6") public WebElement personalinfoTab;
	@FindBy(xpath="//div[@id='root']/div/div[2]/header/div[2]/div/div/div/div/div/a[2]/span/h6") public WebElement ipiNumberTab;
	@FindBy(name="firstName") public WebElement profile_firstName;
	@FindBy(name="lastName") public WebElement profile_lastName;
	@FindBy(name="stageName") public WebElement profile_username;
	@FindBy(xpath="//div[@id='root']/div/div[2]/div/div/div/div/form/div/div/div[4]/button/span") public WebElement userName_cancelbutton;
	@FindBy(xpath="//div[@id='root']/div/div[2]/div/div/div/div/form/div/div/div[4]/button[2]/span") public WebElement userName_updatebutton;
	
	public void updateFirstName(String firstName)
	{
		//profile_firstName.clear();
		profile_firstName.sendKeys(Keys.CONTROL+"a");
		profile_firstName.sendKeys(Keys.DELETE);
		profile_firstName.sendKeys(firstName);
	}
	
	public void updateLastName(String lastName)
	{
		//profile_lastName.clear();
		profile_firstName.sendKeys(Keys.CONTROL+"a");
		profile_firstName.sendKeys(Keys.DELETE);
		profile_lastName.sendKeys(lastName);
	}
	
	public void updateUserName(String userName)
	{
		//profile_username.clear();
		profile_firstName.sendKeys(Keys.CONTROL+"a");
		profile_firstName.sendKeys(Keys.DELETE);
		profile_username.sendKeys(userName);
	}
}
