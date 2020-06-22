package automation.stagetech.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.stagetech.pages.HomeScreen;
import automation.stagetech.pages.LoginScreen;
import automation.stagetech.pages.ProfileScreen;

public class TC002_ProfileUpdate extends SetupClass
{
	@Test(dataProvider="setData")
	public void UpdateUserName(String email, String password) throws InterruptedException, IOException
	{
		LoginScreen ls= new LoginScreen(driver);
		HomeScreen hs= new HomeScreen(driver);
		ProfileScreen ps= new ProfileScreen(driver);
		ls.enter_email(email);
		ls.enter_password(password);
		ls.click_signinButton();
		Thread.sleep(5000);
		hs.sidePane_profileButton.click();
		ps.personalinfoTab.click();
		System.out.println(ps.profile_firstName.getAttribute("value"));
		System.out.println(ps.profile_lastName.getAttribute("value"));
		System.out.println(ps.profile_username.getAttribute("value"));
		ps.updateFirstName("Suraj2");
		ps.updateLastName("Shinde2");
		ps.updateUserName("surajshinde");
		ps.userName_cancelbutton.click();
		Thread.sleep(5000);
		ps.updateFirstName("Suraj2");
		ps.updateLastName("Shinde2");
		ps.updateUserName("surajshinde");
		ps.userName_updatebutton.click();
		
	}
	
	@DataProvider
	public Object[][] setData()
	{
		String username="suraj.shinde@globalstep.com";
		String password="Test@007";
		
		return new Object[][]{{username,password}};
		
		
	}
}
