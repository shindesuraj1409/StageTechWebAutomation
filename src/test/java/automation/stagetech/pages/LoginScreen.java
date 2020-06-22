package automation.stagetech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginScreen extends POM
{

	public LoginScreen(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="email") WebElement email_field;
	@FindBy(name="password") WebElement password_field;
	@FindBy(xpath="//span[@class='MuiButton-label']") WebElement login_button;
	@FindBy(css="svg.MuiSvgIcon-root") WebElement view_password;
	@FindBy(xpath="//span[@class='MuiTypography-root MuiFormControlLabel-label MuiTypography-body1']") WebElement remember_field;
	@FindBy(xpath="//a[@class='MuiTypography-root MuiLink-root MuiLink-underlineHover MuiTypography-colorPrimary']") WebElement forgot_password;
	@FindBy(linkText="Sign Up") WebElement signUp;
	@FindBy(xpath="//p[@class='MuiFormHelperText-root MuiFormHelperText-contained Mui-error' and text()='Please enter your email address']") public WebElement email_error;
	@FindBy(xpath="//p[@class='MuiFormHelperText-root MuiFormHelperText-contained Mui-error' and text()='Please enter your password']") public WebElement password_error;
	//Action methods
	public void enter_email(String email)
	{
		email_field.click();
		email_field.clear();
		email_field.sendKeys(email);
	}
	
	public void enter_password(String password)
	{
		password_field.click();
		password_field.clear();
		password_field.sendKeys(password);
	}
	
	public void click_signinButton()
	{
		login_button.click();
	}
	
	public void view_password()
	{
		view_password.click();
	}
	
	public void click_remember_field()
	{
		remember_field.click();
	}
	
	public void click_forgotPassword()
	{
		forgot_password.click();
	}
	
	public void click_signUp()
	{
		signUp.click();
	}
	

	
}
