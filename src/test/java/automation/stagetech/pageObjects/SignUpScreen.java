package automation.stagetech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpScreen extends POM
{
	public SignUpScreen(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id='root']/div/main/div/div[1]/button/span[1][text()='For Creators']") public WebElement signupCreator;
	@FindBy(xpath="//*[@id='root']/div/main/div/form/div[1]/div/input") public WebElement creatorEmail;
	@FindBy(xpath="//*[@id='root']/div/main/div/form/div[1]/p") public WebElement emailError;
	@FindBy(xpath="//*[@id='root']/div/main/div/div[3]/button/span[1][text()='For Publishers']") public WebElement signupPublisher;
	@FindBy(xpath="//*[@id='root']/div/main/div/form/button/span[1][text()='Create Account']") public WebElement creatAccount;
	@FindBy(linkText="Sign In") public WebElement signInlink;
	@FindBy(linkText="For Publishers") public WebElement publisherLink;
	@FindBy(xpath="//*[@id='root']/div/div/div/div/h6") public WebElement confirmationemailHeader;
	@FindBy(xpath="//*[@id='root']/div/div/div/div/p") public WebElement confirmationemailmessage;
	@FindBy(xpath="//*[@id='root']/div/main/div/form/div[1]/div[1]") WebElement publisherIPInumnber;
	@FindBy(xpath="//*[@id='root']/div/main/div/form/div[1]/div[2]/div/div/input") WebElement publisherEmail; 
	@FindBy(xpath="//*[@id='root']/div/main/div/form/div[2]/button/span[1]") public WebElement publisherCreatAccountButton;
	
	
	public void enterCratorEmail(String email)
	{
		creatorEmail.sendKeys(email);
	}
	public void enterPublisherIPInumber(String IPInumber)
	{
		publisherIPInumnber.sendKeys(IPInumber);
	}
	
	public void enterPublisherEmail(String email)
	{
		publisherEmail.sendKeys(email);
	}

}
