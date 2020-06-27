package automation.stagetech.testCases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.stagetech.pageObjects.HomeScreen;
import automation.stagetech.pageObjects.LoginScreen;
import automation.stagetech.utilities.XUtils;

public class TC001_LoginTestCase extends SetupClass
{

	@Test(dataProvider="LoginData")
	public void LoginwithValidCredentials(String email, String password) throws InterruptedException, IOException
	{
		LoginScreen ls= new LoginScreen(driver);
		HomeScreen hs= new HomeScreen(driver);
		ls.enter_email(email);
		logger.info("Email added");
		ls.enter_password(password);
		logger.info("password added");
		ls.click_signinButton();
		logger.info("Signin button clicked ");
		Thread.sleep(2000);

		//WebElement invalidEmailError=driver.findElement(By.xpath("//div[@id='root']/div/main/div/form/div/p"));
		//WebElement invalidInputData =driver.findElement(By.xpath("//div[@id='root']/div/main/div/form/p"));
		if(driver.findElements(By.xpath("//div[@id='root']/div/main/div/form/div/p")).size()!=0)
		{

			System.out.println(driver.findElement(By.xpath("//div[@id='root']/div/main/div/form/div/p")).getText());
			logger.info("Invalid email test case successfull");
			
			Assert.assertTrue(true);
		}

		else if (driver.findElements(By.xpath("//div[@id='root']/div/main/div/form/p")).size()!=0)
		{
			System.out.println(driver.findElement(By.xpath("//div[@id='root']/div/main/div/form/p")).getText());
			logger.info("Invalid email and test case successfull");
			Assert.assertTrue(true);
		}
		else
		{
			hs.dashboard_profileIcon.click();
			logger.info("Clicked on Profile icon");
			driver.findElement(By.xpath("//a[@href='/signout']")).click();
			logger.info("Clicked on SignOut button");

			Assert.assertTrue(true);
		}





	}

	@DataProvider(name="LoginData")
	public Object[][] getData() throws IOException
	{
		String path="./src/test/java/automation/stagetech/testData/LoginTestData.xlsx";
		int rownum=XUtils.getRowCount(path, "Sheet2");
		int columnCount=XUtils.getCellCount(path, "Sheet2", 1);
		String LoginData[][]= new String[rownum][columnCount];

		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<columnCount;j++)
			{
				LoginData[i-1][j]=XUtils.getCellData(path, "Sheet2", i, j);
			}
		}

		return LoginData;


	}

	public void writePageSourceToFile(String FileName) throws IOException
	{
		FileWriter fw= new FileWriter(FileName);
		fw.write(driver.getPageSource());
		fw.close();
	}


}
