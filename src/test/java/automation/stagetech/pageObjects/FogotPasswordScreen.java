package automation.stagetech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FogotPasswordScreen extends POM 
{
	public FogotPasswordScreen(WebDriver driver)
	{
	super(driver);	// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id='root']/div/main/div/form/div[1]/div/input") public WebElement email;
	@FindBy(xpath="//*[@id='root']/div/main/div/form/button/span[1]") public WebElement sendRestLink;
	@FindBy(linkText="Return to Sign In") public WebElement retuntoSignIn;

}
