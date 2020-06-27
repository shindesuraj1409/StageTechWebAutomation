package automation.stagetech.pageObjects;

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
	@FindBy(id="client-snackbar") public WebElement profile_updateSuccessbar;
	@FindBy(name="currentPassword") public WebElement profile_currentPassword;
	@FindBy(css="div.MuiInputAdornment-root.MuiInputAdornment-filled.MuiInputAdornment-positionEnd > button.MuiButtonBase-root.MuiIconButton-root > span.MuiIconButton-label > svg.MuiSvgIcon-root > path") public WebElement profile_currenPasswordView;
	@FindBy(name="newPassword") public WebElement profile_newPassword;
	@FindBy(css="div.MuiInputBase-root.MuiFilledInput-root.MuiFilledInput-underline.MuiInputBase-fullWidth.Mui-focused.Mui-focused.MuiInputBase-formControl.MuiInputBase-adornedEnd.MuiFilledInput-adornedEnd > div.MuiInputAdornment-root.MuiInputAdornment-filled.MuiInputAdornment-positionEnd > button.MuiButtonBase-root.MuiIconButton-root > span.MuiIconButton-label > svg.MuiSvgIcon-root") public WebElement profile_newPasswordView;
	@FindBy(xpath="//div[@id='root']/div/div[2]/div/div/div/div/form[2]/div/div[2]/button/span") public WebElement profile_passwordCancel;
	@FindBy(xpath="//div[@id='root']/div/div[2]/div/div/div/div/form[2]/div/div[2]/button[2]/span") public WebElement profile_passwordUpdatebutton;
	@FindBy(name="newEmail") public WebElement profile_newEmail;
	@FindBy(xpath="(//input[@name='password'])[2]") public WebElement profile_newEmailPassword;
	@FindBy(css= "div.MuiInputBase-root.MuiFilledInput-root.MuiFilledInput-underline.MuiInputBase-fullWidth.Mui-focused.Mui-focused.MuiInputBase-formControl.MuiInputBase-adornedEnd.MuiFilledInput-adornedEnd > div.MuiInputAdornment-root.MuiInputAdornment-filled.MuiInputAdornment-positionEnd > button.MuiButtonBase-root.MuiIconButton-root > span.MuiIconButton-label > svg.MuiSvgIcon-root") public WebElement profile_newEmailViewPassword;
	@FindBy(name="currentEmail") public WebElement profile_currentEmail;
	@FindBy(xpath="//div[@id='root']/div/div[2]/div/div/div/div/form[3]/div/div[2]/button/span") public WebElement profile_newEmailCancelbutton;
	@FindBy(xpath="//div[@id='root']/div/div[2]/div/div/div/div/form[3]/div/div[2]/button[2]/span") public WebElement profile_newEmailUpdateButton;
	
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
		profile_lastName.sendKeys(Keys.CONTROL+"a");
		profile_lastName.sendKeys(Keys.DELETE);
		profile_lastName.sendKeys(lastName);
	}
	
	public void updateUserName(String userName)
	{
		//profile_username.clear();
		profile_username.sendKeys(Keys.CONTROL+"a");
		profile_username.sendKeys(Keys.DELETE);
		profile_username.sendKeys(userName);
	}
	
	public void enterCurrentPassword(String currentPassword)
	{
		profile_currentPassword.click();
		profile_currentPassword.sendKeys(currentPassword);
	}
	
	public void enterNewPassword(String newPassword)
	{
	
		profile_newPassword.click();
		profile_newPassword.sendKeys(newPassword);
	}
	
	public void enterNewEmail(String newEmail)
	{
		profile_newEmail.click();
		profile_newEmail.sendKeys(newEmail);
	}
	
	public void enterPasswordforNewEmail(String password)
	{
		//profile_newEmailPassword.click();
		profile_newEmailPassword.sendKeys(password);
		logger.info("password entered:"+password);
	}
}
