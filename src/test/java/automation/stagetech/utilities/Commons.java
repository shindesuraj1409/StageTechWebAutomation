package automation.stagetech.utilities;

import org.openqa.selenium.WebDriver;

import automation.stagetech.pageObjects.LoginScreen;

public class Commons 
{
	public static void LogintoSite(String username, String password, WebDriver driver)
	{
		LoginScreen ls= new LoginScreen(driver);
		ls.enter_email(username);
		ls.enter_password(password);
		ls.click_signinButton();
	}

}
