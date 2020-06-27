package automation.stagetech.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.stagetech.pageObjects.HomeScreen;
import automation.stagetech.pageObjects.LoginScreen;
import automation.stagetech.pageObjects.ProfileScreen;

public class TC002_ProfileUpdate extends SetupClass
{
	@Test(dataProvider="setData",enabled=false)
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
		ps.updateFirstName("Suraj1");
		ps.updateLastName("Shinde1");
		ps.updateUserName("surajshinde1");
		ps.userName_cancelbutton.click();
		Thread.sleep(5000);
		ps.updateFirstName("Suraj1");
		ps.updateLastName("Shinde1");
		ps.updateUserName("surajshinde1");
		ps.userName_updatebutton.click();
		String text=ps.profile_updateSuccessbar.getText();
		Assert.assertTrue(text.equals("Successfully updated profile data1."), "Username updated successfully");
	}

	@Test(dataProvider="setData", enabled=false)
	public void updatePasssword(String email, String password) throws InterruptedException, IOException
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
		ps.enterCurrentPassword("Test@007");
		ps.profile_currenPasswordView.click();
		ps.enterNewPassword("Test@008");
		ps.profile_newPasswordView.click();
		driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/div/form[2]/div")).click();
		ps.profile_passwordCancel.click();
		Thread.sleep(5000);
		ps.enterCurrentPassword("Test@007");
		ps.enterNewPassword("Test@008");
		driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/div/form[2]/div")).click();
		ps.profile_passwordUpdatebutton.click();
		String succesText=ps.profile_updateSuccessbar.getText();
		if(succesText.equals("aasvas "))
		{
			Assert.assertTrue(true);
			logger.info("Test case pass");
		}
		else
		{
			captureScreenshot(driver, "updatePasssword");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		//Assert.assertTrue(succesText.equals("Successfully changed password."), "Unable to update the Password");

	}



	@Test(dataProvider="setData", enabled=true)
	public void updateEmail(String email, String password) throws InterruptedException, IOException
	{
		LoginScreen ls= new LoginScreen(driver);
		HomeScreen hs= new HomeScreen(driver);
		ProfileScreen ps= new ProfileScreen(driver);
		ls.enter_email(readConfig.getUserName());  // enter email
		logger.info("Email Entered");
		ls.enter_password(readConfig.getPassword());// enter password
		logger.info("Password Entered");
		ls.click_signinButton();
		Thread.sleep(5000);
		hs.sidePane_profileButton.click();
		ps.personalinfoTab.click();
		System.out.println(ps.profile_currentEmail.getAttribute("value"));
		ps.enterNewEmail("suraj.shinde@gmail.com");
		ps.enterPasswordforNewEmail("Test@008");
		ps.profile_newEmailViewPassword.click();
		ps.profile_newEmailCancelbutton.click();
		
		ps.enterNewEmail("suraj.shinde@gmail.com");
		ps.enterPasswordforNewEmail("Test@008");
		ps.profile_newEmailViewPassword.click();
		ps.profile_newEmailUpdateButton.click();
		//System.out.println(ps.profile_updateSuccessbar.getText());
		String succesText=ps.profile_updateSuccessbar.getText();
		if(succesText.equals("aasvas "))
		{
			Assert.assertTrue(true);
			logger.info("Test case pass");
		}
		else
		{
			captureScreenshot(driver, "updateEmail");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		
		
		
		
	}

	@DataProvider
	public Object[][] setData()
	{
		String username="suraj.shinde@globalstep.com";
		String password="Test@008";

		return new Object[][]{{username,password}};


	}
}
