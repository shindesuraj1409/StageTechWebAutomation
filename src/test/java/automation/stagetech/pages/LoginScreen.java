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
	
	//Action methods
	public void enter_email(String email)
	{
		email_field.click();
		email_field.clear();
		email_field.sendKeys("email");
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
	
}
